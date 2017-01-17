package ua.goit.offline.impl;

import ua.goit.offline.api.UserCache;
import ua.goit.offline.model.User;

import java.util.HashMap;
import java.util.Map;

public class UserCacheImpl implements UserCache{

    private Map<String, User> cache = new HashMap<>();

    private UserService service;

    public User get(String name) {
        User user = cache.get(name);
        if (user == null){
            user = service.load(name);
            cache.put(name, user);

        }
        return user;
    }

    public void setService(UserService service) {
        this.service = service;
    }

    public void setCache(HashMap cache) {
    }
}
