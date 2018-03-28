package it.depends;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addfood")
public class AddFoodServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/addfood.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String foodName = req.getParameter("food");

        if (foodName == null || foodName.length() == 0) {
            req.setAttribute("error", "You didn't type anything!");
            req.getRequestDispatcher("/WEB-INF/addfood.jsp").forward(req, resp);
        } else {
            FoodManager foodManager = (FoodManager) getServletContext().getAttribute("foodManager");
            foodManager.addFood(new Food(foodName));

            resp.sendRedirect("/itdepends/menu");
        }
    }
}
