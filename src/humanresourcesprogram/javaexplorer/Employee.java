/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package humanresourcesprogram.javaexplorer;

/**
 *
 * @author jason
 */
public class Employee {
    private int ID;
    private String name;
    private double salary;


    Employee(int ID){                                                           //Constructor w/ employeeID
        this.ID=ID;
    }//Employee(int ID){

    Employee(int ID,String name){                                               //Constructor w/ employeeID and name
        this.ID=ID;
        this.name=name;
    }//Employee(int ID,String name){

    Employee(int ID,String name,double salary){                                 //Constructor w/ employeeID, name, salary
        this.ID=ID;
        this.name=name;
        this.salary=salary;
    }//Employee(int ID,String name,double salary){

    Employee(String name,int ID,double salary){                                 //Constructor w/ employeeID, name, salary
        this.ID=ID;                                                             //same as above but different order
        this.name=name;
        this.salary=salary;
    }//Employee(String name,int ID,double salary){

    public int getID(){                                                         //gets employee ID
        return ID;                                                              //no set method because it must added with constructor
    }//public int getID(){

    public void setName(String name){                                           //sets employee name
        this.name=name;
    }//public void setName(String name){

    public String getName(){                                                    //gets employee name
        return name;
    }//public String getName(){

    public void setSalary(double salary){                                       //sets the employee salary
        this.salary=salary;
    }//public void setSalary(double salary){

    public double getSalary(){                                                  //gets the employee salary
        return salary;
    }//public double getSalary(){

    @Override
    public String toString(){                                                   //override for outputting employee info
        return "ID: "+ID+" Name: "+name+" Salary: "+salary;
    }//public String toString(){
}//public class Employee {