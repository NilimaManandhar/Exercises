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
public class testAverage {
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the score for Math :");
        int math = input.nextInt();
        System.out.print("Ener the score for Eng :");
        int eng=input.nextInt();
        System.out.print("Enter the score for Jap:");
        int jap=input.nextInt();
        int total = (math+eng+jap)/3;
        System.out.println("The total is "+ total);
        
        
    }
    
}
