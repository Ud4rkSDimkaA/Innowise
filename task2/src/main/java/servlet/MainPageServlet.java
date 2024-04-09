package servlet;

import db.ProductDB;
import model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet("/mainpage")
public class MainPageServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int overallSum = 0;
        List<Product> checkList = new ArrayList<>();
        List<Product> productsFromDB = (List<Product>) req.getSession().getAttribute("products");
        String[] products = req.getParameterValues("product");

        if(productsFromDB!=null){
            for(Product product: productsFromDB){
                for (String s: products){
                    if(product.getName().equals(s)){
                        checkList.add(product);
                        overallSum+=product.getPrice();
                    }
                }
            }
        }
        HttpSession session = req.getSession();
        session.setAttribute("innerProducts", checkList);
        session.setAttribute("overallSum", overallSum);
        req.getRequestDispatcher("/checkpage.jsp").forward(req, resp);
    }
}
