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
public class milesPerGallon {
    public static void main(String[] args)
    {
        double driven;
        double gas;
        Scanner input = new Scanner(System.in);
        System.out.print("enter the miles driven :");
        driven = input.nextDouble();
        System.out.print("Enter the gas used : ");
        gas= input.nextDouble();
        double mpg=driven/gas;
        System.out.println("The MPG is "+ mpg);
    }
    
}
