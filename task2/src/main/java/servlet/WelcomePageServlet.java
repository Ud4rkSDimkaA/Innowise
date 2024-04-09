package servlet;

import db.ProductDB;
import lombok.Getter;
import model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/welcome")
@Getter
public class WelcomePageServlet extends HttpServlet {

    protected ProductDB productDB = new ProductDB();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/welcome.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        productDB.initProductDB();
        HttpSession session = req.getSession();
        List<Product> products = productDB.getProducts();
        session.setAttribute("products", products);
        session.setAttribute("username", req.getParameter("name"));
        req.getRequestDispatcher("/main.jsp").forward(req,resp);
    }
}
