/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
    
    ArrayList<DeliveryMan> deliveryManDirectory;

    public DeliveryManDirectory() {
        deliveryManDirectory = new ArrayList<DeliveryMan>();
    }
    
    public DeliveryMan createDeliveryMan(){
        DeliveryMan deliveryMan = new DeliveryMan();
        deliveryManDirectory.add(deliveryMan);
        return deliveryMan;
    }
    
    public void addDeliveryMan(DeliveryMan deliveryMan){
        deliveryManDirectory.add(deliveryMan);
    }
    
    public ArrayList<DeliveryMan> getDeliveryManDirectory(){
        return deliveryManDirectory;
    }
    
    public void deleteDeliveryMan(DeliveryMan customer){
        deliveryManDirectory.remove(customer);
    }
    
}
