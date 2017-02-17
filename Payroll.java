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
public class Payroll {
    private String employeeName;
    private int id;
    private double hourly;
    private double hoursWorked;
    
    public Payroll(String nm, int id)
    {
        this.employeeName=nm;
        this.id=id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getId() {
        return id;
    }

    public double getHourly() {
        return hourly;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHourly(double hourly) {
        this.hourly = hourly;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    public double wage()
    {
        return hourly*hoursWorked;
    }
    
}
