package exercises;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nilima M
 */
public class energyDrinkConsumption {
    public static void main(String[] args)
    {
        int totalCustomers=15000;
        double percentOfEnergyDrink=.18;
        double approximateNumberWhoPurchased= percentOfEnergyDrink*totalCustomers;
        System.out.println("the approximate number of customers in the suervey who purchased one or more energy drinsk "+approximateNumberWhoPurchased );
        System.out.println("The number who prefer citrus-flavored energy drinks "+(.58*approximateNumberWhoPurchased) );
    }
    
}
