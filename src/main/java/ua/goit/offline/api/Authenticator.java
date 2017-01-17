package ua.goit.offline.api;

import ua.goit.offline.model.User;

public interface Authenticator {

    boolean auth(User user, String password);
}
