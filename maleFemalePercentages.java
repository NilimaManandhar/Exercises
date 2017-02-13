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
public class maleFemalePercentages {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of males : ");
        double males = input.nextInt();
        System.out.print("Enter the number of femails : ");
        double females=input.nextInt();
        double total = males+females;
        double malesPercent = (males/total)*100;
        double femalesPercent = (females/total)*100;
        System.out.println("The percentage of male is : "+ malesPercent);
        System.out.println("The percentage of female is: "+ femalesPercent);
        
    }
    
}
