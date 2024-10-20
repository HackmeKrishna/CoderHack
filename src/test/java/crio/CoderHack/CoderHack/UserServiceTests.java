package com.coderhack;

import com.coderhack.model.User;
import com.coderhack.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserServiceTests {

    @Autowired
    private UserService userService;

    @Test
    public void testUserRegistration() {
        User user = new User();
        user.setUserId("test123");
        user.setUsername("John Doe");
        User savedUser = userService.createUser(user);
        assertEquals(0, savedUser.getScore());
        assertTrue(savedUser.getBadges().isEmpty());
    }

    @Test
    public void testScoreUpdateAndBadges() {
        User user = new User();
        user.setUserId("test123");
        user.setUsername("John Doe");
        userService.createUser(user);
        
        User updatedUser = userService.updateScore("test123", 35);
        assertEquals(35, updatedUser.getScore());
        assertTrue(updatedUser.getBadges().contains("CODE_CHAMP"));
    }
}
