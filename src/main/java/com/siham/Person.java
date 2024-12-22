package com.siham;


public class Person implements Comparable<Person> {
    private String lastName;
    private String firstName;

    public Person(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public int compareTo(Person other) {
        int lastNameComparison = this.lastName.compareTo(other.lastName);
        if (lastNameComparison != 0) {
            return lastNameComparison; // Sort by last name
        } else {
            return this.firstName.compareTo(other.firstName); // Sort by first name if last names are identical
        }
    }

    @Override
    public String toString() {
        return lastName + ", " + firstName;
    }
}