package main.java.controller.good;

import main.java.pojo.User;
import main.java.service.User.UserService;
import main.java.service.User.UserServiceImpl;
import redis.clients.jedis.Jedis;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/login")
public class Login extends HttpServlet {
    UserService userService = new UserServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        User userByUsername = userService.findUserByUsername(username);
        if (userByUsername == null || !password.equals(userByUsername.getPassword())) {
            req.setAttribute("msg","登录失败，密码错误或者未注册");
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }else {
            Jedis jedis = new Jedis("localhost");
            jedis.set("userId",String.valueOf(userByUsername.getId()));
            jedis.expire("userId",600);
            resp.sendRedirect("/show_books");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
