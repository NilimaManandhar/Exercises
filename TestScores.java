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
public class TestScores {
    private int japanese;
    private int maths;
    private int computer;

    public int getJapanese() {
        return japanese;
    }

    public int getMaths() {
        return maths;
    }

    public int getComputer() {
        return computer;
    }

    public void setJapanese(int japanese) {
        this.japanese = japanese;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public void setComputer(int computer) {
        this.computer = computer;
    }
    public int avgScores()
    {
        int avg=(japanese+maths+computer)/3;
        return avg;
    }
    
}
