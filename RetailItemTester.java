/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

/**
 *
 * @author Nilima M
 */
public class RetailItemTester {
    public static void main(String[] args)
    {
        RetailItem item1= new RetailItem();
        RetailItem item2= new RetailItem();
        RetailItem item3= new RetailItem();
        item1.setDescription("Item#1\t Jacket\t");
        item2.setDescription("Item#2\t Designer Jeans");
        item3.setDescription("Item#3\t Shirt\t");
        
        item1.setUnitsOnHand(12);
        item2.setUnitsOnHand(40);
        item3.setUnitsOnHand(20);
        
        item1.setPrice(59.95);
        item2.setPrice(34.95);
        item3.setPrice(24.95);
        
        System.out.println("Description\t Units on Hand \t Price");
        System.out.println(item1.getDescription()+ "\t"+ item1.getUnitsOnHand()+ "\t"+ item1.getPrice());
        System.out.println(item2.getDescription()+ "\t"+ item2.getUnitsOnHand()+ "\t"+ item2.getPrice());
        System.out.println(item3.getDescription()+ "\t"+ item3.getUnitsOnHand()+ "\t"+ item3.getPrice());
    }
    
}
