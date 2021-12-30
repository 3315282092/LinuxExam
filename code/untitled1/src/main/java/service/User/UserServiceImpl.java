package main.java.service.User;

import main.java.dao.user.UserDao;
import main.java.dao.user.UserDaoImpl;
import main.java.pojo.User;

public class UserServiceImpl implements UserService{
    UserDao userDao = new UserDaoImpl();
    @Override
    public boolean addUser(User user) {
        return userDao.addUser(user) > 0 ? true:false;
    }

    @Override
    public User findUserByUsername(String username) {
        return userDao.findUserByUsername(username);
    }
}
