package ua.goit.offline.impl;

import ua.goit.offline.api.Authenticator;
import ua.goit.offline.model.User;

public class AuthenticatorImpl implements Authenticator {
    @Override
    public boolean auth(User user, String password) {
        return user.getPassword().equals(password);
    }
}
