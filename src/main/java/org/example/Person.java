package org.example;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    private String FirstName;
    private String LastName;

    public Person(String firstName, String lastName) {
        FirstName = firstName;
        LastName = lastName;
    }
}
