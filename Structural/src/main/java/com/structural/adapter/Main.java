package com.structural.adapter;

public class Main {
    public static void main(String[] args) {

        User user = new User("Alice", "alice@example.com");

        // Save the user using the UserRepository, with transparent adaptation
        UserRepository userRepository = new UserRepository();
        userRepository.saveUser(user);
    }
}