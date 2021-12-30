package main.java.controller.good;

import main.java.pojo.Book;
import main.java.service.good.BookService;
import main.java.service.good.BookServiceImpl;
import redis.clients.jedis.Jedis;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/to_update_book")
public class BookUpdate extends HttpServlet {
    BookService bookService = new BookServiceImpl();
    Jedis jedis = new Jedis("localhost");
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (jedis.get("userId") == null) {
            req.setAttribute("msg","请先登录");
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }
        String id = req.getParameter("id");
        Book bookById = bookService.findBookById(Integer.parseInt(id));
        req.setAttribute("book",bookById);
        req.getRequestDispatcher("/update.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
