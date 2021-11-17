/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    ArrayList<Restaurant> restaurantDirectory;

    public RestaurantDirectory() {
        this.restaurantDirectory = new ArrayList<Restaurant>();
    }
    
    public Restaurant createRestaurant(){
        Restaurant restaurant = new Restaurant();
        restaurantDirectory.add(restaurant);
        return restaurant;
    }
    
    public void addRestaurant(Restaurant restaurant){
        restaurantDirectory.add(restaurant);
    }
    
    public void deleteRestaurant(Restaurant restaurant){
        restaurantDirectory.remove(restaurant);
    }
    
    public ArrayList<Restaurant> getRestaurantDirectory(){
        return restaurantDirectory;
    }
    
}
