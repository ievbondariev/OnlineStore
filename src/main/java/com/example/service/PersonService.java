package com.example.service;

import com.example.model.Person;

import java.util.List;

public interface PersonService {
    Person createPerson(Person person);

    Person updatePerson(Person person);

    void deletePerson(Person person);

    Person getPersonById(Long id);

    List<Person> getAllPerson();

}