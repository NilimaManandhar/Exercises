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
public class Employee {
    private String name;
    private int idNumber;
    private String department;
    private String position;

//setters and getters for name 
public void setName(String name)
{
this.name=name;
}
public String getName()
{
    return name;
}
//setters and getters for idNumber 
public void setId(int idNumber)
{
this.idNumber=idNumber;
}
public int getId()
{
    return idNumber;
}
public void setDepartment(String department)
{
    this.department=department;
}
public String getDepartment()
{
    return department;
}
public void setPosition(String position)
{
    this.position=position;
    
}
public String getPosition()
{
    return position;
}

}
