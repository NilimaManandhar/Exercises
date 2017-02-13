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
public class cookieCalorie {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of cookies eaten: ");
        int cookie = input.nextInt();
        int oneCookieCalorie = 300/10;
        int totalCalories = cookie*oneCookieCalorie;
        System.out.println("The total number of cookies consumed is : "+ totalCalories);
    }
    
}
