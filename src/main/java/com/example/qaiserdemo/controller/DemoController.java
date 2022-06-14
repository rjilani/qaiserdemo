package com.example.qaiserdemo.controller;

import com.example.qaiserdemo.domain.Person;
import com.example.qaiserdemo.service.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DemoController {


    @Autowired
    PersonRepository personRepository;

    @Value("${spring.application.name}")
    private String name;

    @GetMapping("/demo")
    private String index() {
        System.out.println(name);
        return "Hello World!";
    }

    @PostMapping("/person")
    private int savePerson(@RequestBody Person person) {

        Person p = personRepository.save(person);
        return p.getId();

    }

    @GetMapping("/persons")
    private List<Person> getAllPerson() {

        return (List<Person>)personRepository.findAll();

    }

    @GetMapping(path = "/person/{id}", produces= MediaType.APPLICATION_JSON_VALUE)
    private ResponseEntity<Person> getPersonById(@PathVariable("id") int id) {
        Optional<Person> person = personRepository.findById(id);
        return new ResponseEntity<Person>(person.get(), HttpStatus.OK);
    }

    @DeleteMapping("/person/{id}")
    private int deletePerson(@PathVariable("id") int id) {
        personRepository.deleteById(id);
        return 1;
    }

    @PutMapping(path = "/person/{id}", produces= MediaType.APPLICATION_JSON_VALUE)
    private Person updatePerson(@PathVariable("id") int id, @RequestBody Person inPerson) {

        Optional<Person> person = personRepository.findById(id);
        person.get().setAge(inPerson.getAge());
        person.get().setEmail(inPerson.getEmail());
        person.get().setName(inPerson.getName());


        Person p = personRepository.save(person.get());
        return p;

    }
}
