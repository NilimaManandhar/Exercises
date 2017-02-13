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
public class stockCommission {
    public static void main(String[] args)
    {
        double stock = 1000;
        double price=25.50;
        double stockPaid= stock*price;
        double commission=.02*stockPaid;
        System.out.println("The total amount paid was :$"+ stockPaid);
        System.out.println("The amount for the commission : "+ commission);
        System.out.println("The total amount : $"+ (commission+stockPaid) ) ;      
    }
}
