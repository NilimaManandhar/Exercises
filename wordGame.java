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
public class wordGame {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name :");
        String name=input.nextLine();
        System.out.print("Enter your city :");
        String city=input.nextLine();
        System.out.print("Enter your age :");
        int age=input.nextInt();
        input.nextLine();
        System.out.print("Enter your college :");
        String college=input.nextLine();
        System.out.print("Enter your profession :");
        String profession=input.nextLine();
        System.out.print("Enter your animal :");
        String animal=input.nextLine();
        System.out.print("Enter your petname :");
        String petname=input.nextLine();
        
        System.out.println(
        "There was once a person named "+ name+
                " who lived in "+ city+". At the age of "
        +age +", "+name+ " went to college at "+ college+
                ". "+ name +" graduated and went to work as "
                        + "a "+ profession + ". Then, "+
                name +" adopted a(n) "+ animal + "named "+ petname+ ". they both lived happily ever after1");
                
            
        
        



        
    }
    
}
