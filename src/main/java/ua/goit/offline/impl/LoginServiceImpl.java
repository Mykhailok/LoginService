package ua.goit.offline.impl;

import ua.goit.offline.api.Authenticator;
import ua.goit.offline.api.LoginService;
import ua.goit.offline.api.UserCache;
import ua.goit.offline.model.User;

public class LoginServiceImpl implements LoginService {

    private UserCache userCache;
    private Authenticator authenticator;


    public boolean login(String name, String password) {
        User user = userCache.get(name);
            if (user ==null){
                return false;
            }
        return authenticator.auth(user, password);
    }

    public void setUserCache(UserCache userCache) {
        this.userCache = userCache;
    }

    public void setAuthenticator(Authenticator authenticator) {
        this.authenticator = authenticator;
    }
}
