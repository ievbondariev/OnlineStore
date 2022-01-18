package com.example.controller;

import com.example.model.Person;
import com.example.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/person/createPerson")
    public Person createPerson(@RequestBody Person person) {
        return personService.createPerson(person);
    }

    @PutMapping("/person/updatePerson")
    public Person updatePerson(@RequestBody Person person) {
        return personService.updatePerson(person);
    }

    @DeleteMapping("/person/deletePerson")
    public void deletePerson(@RequestBody Person person) {
        personService.deletePerson(person);
    }

    @GetMapping("/person/{id}")
    @ResponseBody
    public Person getPersonById(@PathVariable Long id) {
        return personService.getPersonById(id);
    }

    @GetMapping("/person/allPerson")
    @ResponseBody
    public List<Person> getAll() {
        return personService.getAllPerson();
    }
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
}
