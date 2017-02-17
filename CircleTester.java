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
public class CircleTester {
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the radius ");
        int r=input.nextInt();
        Circle a=new Circle(r);
        System.out.println("The area is : " + a.getArea());
        System.out.println("The diameter is : "+ a.getDiameter());
        System.out.println("The circumference is : "+ a.getCircumference());
    }
}
