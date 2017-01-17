package ua.goit.offline.api;

import ua.goit.offline.model.User;

public interface UserCache {

    User get(String name);
}
