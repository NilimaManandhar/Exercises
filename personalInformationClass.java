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
public class personalInformationClass {
    public static void main(String[] args)
    {
        personalInformation Nilima = new personalInformation();
        personalInformation Sean = new personalInformation();
        personalInformation Kasey = new personalInformation();
        Nilima.setName("Nilima Manandhar");
        Nilima.setAge(23);
        Nilima.setAddress("1055 Catalpa");
        Nilima.setPhoneNumber("457-787-7878");
        
      
        Sean.setName("Sean Smith");
        Sean.setAge(30);
        Sean.setAddress("1056 Catalpa");
        Sean.setPhoneNumber("477-787-7878");
              
        Kasey.setName("Kasey Richard");
        Kasey.setAge(30);
        Kasey.setAddress("107 Catalpa");
        Kasey.setPhoneNumber("777-787-7878");
        
        System.out.println(Nilima.getName());
        System.out.println(Nilima.getAge());
        System.out.println(Nilima.getAddress());
        System.out.println(Nilima.getPhoneNumber());
        System.out.println();
        System.out.println(Kasey.getName());
        System.out.println(Kasey.getAge());
        System.out.println(Kasey.getAddress());
        System.out.println(Kasey.getPhoneNumber());
        System.out.println();

        System.out.println(Sean.getName());
        System.out.println(Sean.getAge());
        System.out.println(Sean.getAddress());
        System.out.println(Sean.getPhoneNumber());
        System.out.println(Sean.getAddress());
    }
    
}
