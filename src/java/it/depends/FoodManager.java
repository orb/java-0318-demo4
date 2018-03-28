package it.depends;

import java.util.ArrayList;

public class FoodManager {
    ArrayList<Food> items = new ArrayList<> ();
    
    public Food[] getAllFood() {
        // imagine that we are loading tshese frome the database
        // select name from food;

        return (Food[]) this.items.toArray(new Food[]{});
    }
    
    public void addFood(Food newFood) {
        // insert into food values (?) 
        items.add(newFood);
    }
}
