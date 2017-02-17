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
public class petClassTester {
    public static void main(String[] args)
    {
        Pet okra=new Pet();
        okra.setName("Angie");
        okra.setAge(1);
        okra.setType("Dog");
        System.out.println("Name : " + okra.getName());
        System.out.println("Age : " +  okra.getAge());
        System.out.println("Type : " + okra.getType());


    }
    
}
