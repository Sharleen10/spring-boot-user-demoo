package com.example.demo.repo;

import com.example.demo.model.User;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of the FakeRepoInterface that simulates a database repository
 * using an in-memory list of User objects.
 */
@Repository
public class FakeRepo implements FakeRepoInterface {

    // In-memory storage for User objects
    private final List<User> users = new ArrayList<>();

    /**
     * Inserts a new user into the repository
     *
     * @param id The user's ID
     * @param name The user's first name
     * @param surname The user's last name
     * @return The name of the inserted user
     */
    @Override
    public String insertUser(long id, String name, String surname) {
        User user = new User(id, name, surname);
        users.add(user);
        return name;
    }


}