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
import java.util.Scanner;
public class restaurantBill {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the charge for the meal : ");
        double bill= input.nextDouble();
        double tax=7.5/100;
        double tip=18/100;
        double taxbill=(tax*bill)+bill;
        System.out.println("The meal charge is $"+ bill);
        System.out.println("With tax the charge is $"+ taxbill);
        double tipcharge=.18*taxbill;
        System.out.println("The tip charge is "+ tipcharge);
        double totalCost=tipcharge+bill;
        System.out.println(totalCost);
        
    }
}
