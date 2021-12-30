package main.java.controller.good;

import main.java.pojo.User;
import main.java.service.User.UserService;
import main.java.service.User.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/do_register")
public class DoRegister  extends HttpServlet {
    UserService userService = new UserServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        boolean b = userService.addUser(new User(1, username, password));
        if (b){
//            说明注册成功
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }else {
            req.setAttribute("msg","注册失败,用户名重复");
            req.getRequestDispatcher("/register.jsp").forward(req,resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
