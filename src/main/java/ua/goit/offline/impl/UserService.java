package ua.goit.offline.impl;

import ua.goit.offline.model.User;

public class UserService {

    public User load(String name) {
        System.out.println("Add new user " + name);
        return new User(name, "test");
    }
}
