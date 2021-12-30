package main.java.service.User;

import main.java.pojo.User;

public interface UserService {
    public boolean addUser (User user);
    public User findUserByUsername(String username);

}
