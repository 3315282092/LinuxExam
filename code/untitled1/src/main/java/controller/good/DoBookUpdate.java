package main.java.controller.good;

import main.java.pojo.Book;
import main.java.service.good.BookService;
import main.java.service.good.BookServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/do_update")
public class DoBookUpdate extends HttpServlet {
    BookService bookService = new BookServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String book_name = req.getParameter("book_name");
        String writer = req.getParameter("writer");
        Book book = new Book(Integer.parseInt(id), writer, book_name);
        boolean b = bookService.updateBook(book);
       resp.sendRedirect("/show_books");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
