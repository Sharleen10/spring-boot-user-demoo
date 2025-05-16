package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

import com.example.demo.model.User;
import com.example.demo.repo.FakeRepoInterface;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

/**
 * Unit tests for the UserServiceImpl class.
 * Uses Mockito to mock the FakeRepoInterface dependency.
 */
public class UserServiceTests {

    @Mock
    private FakeRepoInterface fakeRepo;

    private UserService userService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        userService = new UserServiceImpl(fakeRepo);
    }

    /**
     * Test for the addUser method
     */
    @Test
    void testAddUser() {
        // Arrange
        String name = "Leen";
        String surname = "Shabangu";
        when(fakeRepo.insertUser(anyLong(), eq(name), eq(surname))).thenReturn(name);

        // Act
        String result = userService.addUser(name, surname);

        // Assert
        assertEquals(name, result);
        verify(fakeRepo, times(1)).insertUser(anyLong(), eq(name), eq(surname));
    }

    /**
     * Test for the removeUser method when user exists
     */
    @Test
    void testRemoveUserWhenUserExists() {
        // Arrange
        long userId = 1L;
        String userName = "Leen";
        when(fakeRepo.deleteUser(userId)).thenReturn(userName);

        // Act
        String result = userService.removeUser(userId);

        // Assert
        assertEquals(userName, result);
        verify(fakeRepo, times(1)).deleteUser(userId);
    }
}

