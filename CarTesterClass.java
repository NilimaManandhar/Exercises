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
public class CarTesterClass {
    public static void main(String[] args)
    {
        car Toyota = new car(2017, "Black");
        System.out.println(Toyota.accelerate());
        System.out.println(Toyota.accelerate());
        System.out.println(Toyota.accelerate());
        System.out.println(Toyota.brake());
        System.out.println(Toyota.brake());
    }
    
}
