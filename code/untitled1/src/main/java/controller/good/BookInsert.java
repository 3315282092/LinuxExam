package main.java.controller.good;

import redis.clients.jedis.Jedis;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/add_book")
public class BookInsert extends HttpServlet {
    Jedis jedis = new Jedis("localhost");
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (jedis.get("userId") == null) {
            req.setAttribute("msg","请先登录");
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }
        req.getRequestDispatcher("/insert.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
