package com.example.qaiserdemo.service;

import com.example.qaiserdemo.domain.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BusinessService {

    @Autowired
    PersonRepository personRepository;

    Logger logger = LoggerFactory.getLogger(this.getClass());

    public List<Person> findAllPersons() {
        logger.info(String.format("calling method %s ", Thread.currentThread().getStackTrace()[1].getMethodName()));

        return (List<Person>) personRepository.findAll();

    }

    public Person savePerson(Person person) {

        logger.info(String.format("calling method %s with person %s ", Thread.currentThread().getStackTrace()[1].getMethodName(), person.toString()));
        return personRepository.save(person);

    }

    public Optional<Person> getPersonById(int id) {

        logger.info(String.format("calling method %s with id %d ", Thread.currentThread().getStackTrace()[1].getMethodName(), id));
        return personRepository.findById(id);

    }

    public int deletePersonById(int id) {

        logger.info(String.format("calling method %s with id %d ", Thread.currentThread().getStackTrace()[1].getMethodName(), id));
        personRepository.deleteById(id);
        return 1;

    }
}
