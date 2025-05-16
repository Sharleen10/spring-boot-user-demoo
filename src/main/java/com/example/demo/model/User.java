package com.example.demo.model;

public class User {
    private long id;
    private String name;
    private String surname;

    /**
     * Default constructor
     */
    public User() {
    }

    /**
     * Parameterized constructor
     *
     * @param id The user's ID
     * @param name The user's first name
     * @param surname The user's last name
     */
    public User(long id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }
}
