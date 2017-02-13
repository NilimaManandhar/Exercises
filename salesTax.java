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
public class salesTax {
    public static void main(String[] args)
    {
        double state= 5.5/100;
        double county=2/100;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of purchase $");
        double purchase = input.nextInt();
        
        double stateTax= state* purchase;
        System.out.println("The sate tax is $: " + stateTax);
        double t1=stateTax+purchase;
        
        System.out.println("With the tax it will be $"+ t1);
        //fix this later
        double countryTax=county*purchase;
       
        System.out.println("The county tax is $:  "+ countryTax);
        double t2=countryTax+purchase;
        System.out.println("With the county tax it will be $"+ t2);
        double total =t1+t2;
        
       
        System.out.println("With the county tax it will cost you :  "+ countryTax);
        System.out.println("Total cost :  "+ total);

        
        
        
    }
    
}
