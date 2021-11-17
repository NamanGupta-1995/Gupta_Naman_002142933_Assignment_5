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

    public CustomerDirectory() {
        customers = new ArrayList<Customer>();
    }
    
    public Customer createCustomer(){
        Customer customer = new Customer();
        customers.add(customer);
        return customer;
    }
    
    public void addCustomer(Customer customer){
        customers.add(customer);
    }
    
    public ArrayList<Customer> getCustomerDirectory(){
        return customers;
    }
    
    public void deleteCustomer(Customer customer){
        customers.remove(customer);
    }
}
