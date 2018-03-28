package it.depends;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/menu")
public class MenuServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FoodManager manager = (FoodManager) getServletContext().getAttribute("foodManager");
        
        req.setAttribute("menuItems", manager.getAllFood());
        req.getRequestDispatcher("/WEB-INF/menu.jsp").forward(req, resp);
    }
}
