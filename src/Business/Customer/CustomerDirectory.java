/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
    private ArrayList<Customer> customers;
    private Customer customer;

    public CustomerDirectory() {
        customers = new ArrayList<Customer>();
    }
    
    public void createCustomer(Customer customer){
        customers.add(customer);
    }
    
}
