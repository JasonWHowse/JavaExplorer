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


    Employee(int ID){
        this.ID=ID;
    }

    Employee(int ID,String name){
        this.ID=ID;
        this.name=name;
    }

    Employee(int ID,String name,double salary){
        this.ID=ID;
        this.name=name;
        this.salary=salary;
    }

    Employee(String name,int ID,double salary){
        this.ID=ID;
        this.name=name;
        this.salary=salary;
    }

    public int getID(){
        return ID;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setSalary(double salary){
        this.salary=salary;
    }

    public double getSalary(){
        return salary;
    }

    public String toString(){
        return "ID: "+ID+" Name: "+name+" Salary: "+salary;
    }

}