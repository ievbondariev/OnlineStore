package com.example.service;

import com.example.model.Person;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.storage.PersonStorage.personStorageList;
@Service
public class PersonServiceImpl implements PersonService{
    @Override
    public Person createPerson(Person person) {
        Person newPerson = person;
        personStorageList.add(newPerson);
        return newPerson;
    }

    @Override
    public Person updatePerson(Person person) {
        Person newPerson = person;
        newPerson.setId(person.getId());
        newPerson.setFirstName(person.getFirstName());
        newPerson.setLastName(person.getLastName());
        newPerson.setEmail(person.getEmail());
        return person;
    }

    @Override
    public void deletePerson(Person person) {
        personStorageList.removeIf(person1 -> person1.equals(person.getId()));
    }

    @Override
    public Person getPersonById(Long id) {
        Person person = new Person();
        person.setId(person.getId());
        return person;
    }

    @Override
    public List<Person> getAllPerson() {
        return personStorageList;
    }
}
