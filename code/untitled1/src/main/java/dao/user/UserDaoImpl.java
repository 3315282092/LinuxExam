package main.java.dao.user;

import main.java.pojo.User;
import main.java.utils.Dbutils;

import java.sql.ResultSet;

public class UserDaoImpl extends Dbutils implements UserDao{
    @Override
    public int addUser(User user) {
        String sql = "insert into user (username,password) values (?,?)";
        Object [] objects = new Object[]{user.getUsername(),user.getPassword()};
        int row = executeUpdate(sql, objects);
        return row;
    }

    @Override
    public User findUserByUsername(String username) {
        String sql = "select * from user where username = ?";
        Object [] objects = new Object[]{username};
        ResultSet resultSet = executeQuery(sql, objects);
        User user = null;
        try {
            while (resultSet.next()){
                user = new User(resultSet.getInt("id"),resultSet.getString("username"),
                        resultSet.getString("password"));
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
}
