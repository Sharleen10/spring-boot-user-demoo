package com.example.demo.service;

import com.example.demo.repo.FakeRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Random;

/**
 * Implementation of the UserService interface.
 * This class contains the business logic for user operations.
 */
@Service
public class UserServiceImpl implements UserService {

    private final FakeRepoInterface fakeRepo;
    private final Random random = new Random();

    /**
     * Constructor injection for the FakeRepoInterface dependency.
     * The @Autowired annotation tells Spring to inject an implementation of FakeRepoInterface.
     *
     * @param fakeRepo An implementation of FakeRepoInterface
     */
    @Autowired
    public UserServiceImpl(FakeRepoInterface fakeRepo) {
        this.fakeRepo = fakeRepo;
    }

    /**
     * Adds a new user with a generated ID
     *
     * @param name The user's first name
     * @param surname The user's last name
     * @return The name of the added user
     */
    @Override
    public String addUser(String name, String surname) {
        // Generate a random ID between 1 and 1000
        long id = random.nextInt(1000) + 1;
        String addedName = fakeRepo.insertUser(id, name, surname);
        System.out.println(addedName + " added");
        return addedName;
    }

}