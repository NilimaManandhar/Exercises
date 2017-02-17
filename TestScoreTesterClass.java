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
public class TestScoreTesterClass {
    public static void main(String[] args)
    {
        TestScores a = new TestScores();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your score in japanese: ");
        int jap=input.nextInt();
        a.setJapanese(jap);
        System.out.print("Enter your score in maths : ");
        int math=input.nextInt();
        a.setMaths(math);
        System.out.print("Enter your score in computer : ");
        int computer=input.nextInt();
        
        a.setComputer(computer);
        System.out.println("Your average score is :" +a.avgScores());
        
    }
    
}
