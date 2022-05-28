package com.example.qaiserdemo.service;

import com.example.qaiserdemo.domain.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {
}
