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
public class car {
    private int yearModel;
    private String make;
    private int speed;
    //Constructor
    public car(int yearModel,String make)
    {
        this.yearModel=yearModel;
        this.make=make;
        this.speed=0;
    }
    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getYearModel() {
        return yearModel;
    }

    public String getMake() {
        return make;
    }

    public int getSpeed() {
        return speed;
    }
    
    public int accelerate()
    {
        this.speed=speed+5;
        return speed;
    }
    public int brake()
    {
        this.speed=speed-5;
        return speed;
    }
}
