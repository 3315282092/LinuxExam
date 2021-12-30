package main.java.dao.user;

import main.java.pojo.User;

public interface UserDao {
    int addUser(User user);
    User findUserByUsername(String username);
}
