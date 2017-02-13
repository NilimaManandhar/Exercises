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
public class stockTransactionProgram {
    public static void main(String[] args)
    {
        int stock=1000;
        double stockPaid=32.87;
        double commission = 2/100;
        double totalMoneyPaid=stock*stockPaid;
        double commissionPaid=commission*totalMoneyPaid;
        System.out.println("The amount of money Joe paid for the stock is $"+ totalMoneyPaid);
        System.out.println("The amount of commission he paid the broker : "+ commissionPaid);
        double soldShares=1000;
        double soldAmount=33.92;
        double totalMoneySold=soldShares*soldAmount;
        System.out.println("The amount of money he sold for is $"+ totalMoneySold);
        double commissionSold=2/100;
        double amountSoldToStockbroker= commissionSold*totalMoneySold;
        System.out.println("He sold the stockbroker $"+ amountSoldToStockbroker);
        double  buying=totalMoneyPaid+commissionPaid;
        double selling=totalMoneySold+amountSoldToStockbroker;
        if(buying>selling)
        {
            System.out.println("Loss");
        }
        else if(selling>buying)
        {
            System.out.println("profit");
        }
        else
        {
            System.out.println("can't be determined");
        }
            
        
    }
    
}
