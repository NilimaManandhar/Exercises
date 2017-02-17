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
public class Temperature {
    double ftemp;
    //constructor
    public Temperature(double ftemp){
        this.ftemp=ftemp;
    }
    public void setFtemp(double ftemp) {
        this.ftemp = ftemp;
    }

    public double getFtemp() {
        return ftemp;
    }
    
    public double getCelsius()
    {
        double c = (ftemp-32)*(5/9);
        return c;
    }
    public double getFahren()
    {
        double k=((5/9)*(ftemp-32))+273;
        return k;
    }
    
}
