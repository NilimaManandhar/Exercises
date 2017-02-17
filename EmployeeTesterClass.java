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
public class EmployeeTesterClass {
    public static void main(String[] args)
    {
        Employee one = new Employee();
        Employee two = new Employee();
        Employee three = new Employee();
        
        one.setName("Susan Meyers");
        one.setId(47899);
        one.setDepartment("Accounting");
        one.setPosition("Vice President");
        
        two.setName("Mark Jones");
        two.setId(39119);
        two.setDepartment("IT");
        two.setPosition("Programmer");
        
        three.setName("Joy Rogers");
        three.setId(81774);
        three.setDepartment("Manufacturing");
        three.setPosition("Engineer");
        //Print it all out
        
        System.out.print("Name\t");
        System.out.print("ID Number\t");
        System.out.print("Department\t");
        System.out.println("Position");
        System.out.println("------------------------------------------------");
        System.out.print(one.getName()+"\t");
        System.out.print(one.getId()+"\t");
        System.out.print(one.getDepartment()+"\t");
        System.out.println(one.getPosition()+"\t");
        System.out.print(two.getName()+"\t");
        System.out.print(two.getId()+"\t");
        System.out.print(two.getDepartment()+"\t");
        System.out.println(two.getPosition()+"\t");
        System.out.print(three.getName()+"\t");
        System.out.print(three.getId()+"\t");
        System.out.print(three.getDepartment()+"\t");
        System.out.print(three.getPosition()+"\t");
        
    }
}
