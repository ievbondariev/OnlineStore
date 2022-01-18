package com.example.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        return id.equals(person.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}