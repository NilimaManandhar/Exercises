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
public class TemperatureClass {
    public static void main(String[] args)
    {
        Temperature a=new Temperature(25);
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a temperature : ");
        double temp = input.nextDouble();
        a.setFtemp(temp);
        System.out.println(a.getCelsius());
        System.out.println(a.getFahren());
    }
    
}
