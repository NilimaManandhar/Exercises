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
public class PayrollTesterClass {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your name :");
        String name = input.nextLine();
        System.out.print("Enter your id :");
        int id=input.nextInt();
        System.out.print("Enter your hourly pay rate : ");
        double hours = input.nextDouble();
        System.out.print("Enter the number of hours worked: ");
        double hoursWorked=input.nextDouble();
        Payroll employee = new Payroll(name, id);
        employee.setHourly(hours);
        employee.setHoursWorked(hoursWorked);
        System.out.println("The gross pay earned is : "+employee.wage());
        
        
    }
}
