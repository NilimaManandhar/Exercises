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
public class ingredientAdjuster {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of cookies that you want to bake: ");
        double cookiesToBake=input.nextInt();
        
        double regularSugar=1.5;
        double regularButter=1;
        double regularFlour=2.75;
        
        
        System.out.println("To bake "+ cookiesToBake + " you need the following: ");
        System.out.println("suger = "+ cookiesToBake/48*regularSugar);
        System.out.println("Butter = "+cookiesToBake/48*regularButter);
        System.out.println("Flour = "+cookiesToBake/48*regularFlour);
        
                
    }
    
}
