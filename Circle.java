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
public class Circle {
    private double radius;
    private double PI=3.17159;
    
    //constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea()
    {
        return PI*radius*radius;
    }
    public double getDiameter()
    {
       return radius*2; 
    }
    public double getCircumference()
    {
        return 2*PI*radius;
    }
}
