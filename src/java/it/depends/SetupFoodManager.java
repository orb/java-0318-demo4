package it.depends;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class SetupFoodManager implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // we'd rather be doing this with annotations, but
        // bear with me

        FoodManager manager = new FoodManager();
        manager.addFood(new Food("Orange Smoothie"));
        manager.addFood(new Food("Bean Burrito"));

        sce.getServletContext().setAttribute("foodManager",
                manager);

        System.out.println("---- STARTING UP, new foodManager created!!!");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}
