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
public class Department {

    private String deptName;
    private Employee[] employees;
    private int employeeCount=0;
    private final int maxEmployees=10;

    public Department (){                                                       //Contructor
        this.employees=new Employee[maxEmployees];
        for(int i=0;i<maxEmployees;i++){
            employees[i]=new Employee("",0,0.0);
        }//for(int i=0;i<maxEmployees;i++){
    }//public Department (){

    public Department(String name) {                                            //constructor with Dept name
        this.deptName = name;
        this.employees=new Employee[maxEmployees];
        for(int i=0;i<maxEmployees;i++){
            employees[i]=new Employee("",0,0.0);
        }//for(int i=0;i<maxEmployees;i++){
    }//public Department(String name) {

    public int getEmployeeCount(){                                              //gets numbers of employees
        return employeeCount;
    }//public int getEmployeeCount(){

    public String getDeptName() {                                               //gets dept name
        return deptName;
    }//public String getDeptName() {

    public void setDeptName(String deptName) {                                  //sets/renames department
        this.deptName = deptName;
    }//public void setDeptName(String deptName) {

    public Employee[] getEmployees(){                                           //returns a list the size of the number of employees
        Employee[] nEmployees =new Employee[employeeCount];
        for(int i=0;i<employeeCount;i++){
            nEmployees[i]=employees[i];
        }//for(int i=0;i<employeeCount;i++){
        return nEmployees;
    }//public Employee[] getEmployees(){

    public void addEmployee (Employee employee){                                //adds a new employee as an employee objectas long as there is room
        if(employeeCount<maxEmployees){                                         // in the department but does nothing if there is no room
            employees[employeeCount]=employee;
            employeeCount++;                                                    //increases number of employees
        }//if(employeeCount<maxEmployees){
    }//public void addEmployee (Employee employee){

    public void addEmployee (int ID){                                           //same as above but only adds a new employee with an employee ID
        if(employeeCount<maxEmployees){
            employees[employeeCount]=new Employee(ID);
            employeeCount++;
        }//if(employeeCount<maxEmployees){
    }//public void addEmployee (int ID){

    public void addEmployee (int ID,String name,double salary){                 //same as above but takes all input values instead of an object
        if(employeeCount<maxEmployees){
            employees[employeeCount]=new Employee(ID,name,salary);
            employeeCount++;
        }//if(employeeCount<maxEmployees){
    }//public void addEmployee (int ID,String name,double salary){

    public void addEmployee (String name,int ID,double salary){                 //same as above just info allowed in a different order
        if(employeeCount<maxEmployees){
            employees[employeeCount]=new Employee(ID,name,salary);
            employeeCount++;
        }//if(employeeCount<maxEmployees){
    }//public void addEmployee (String name,int ID,double salary){

    @Override
    public String toString(){                                                   //toString Overrides the Object to String
        String string = "Department name: "+deptName;
        for(int i=0;i<employeeCount;i++){
            string=string+"\n"+employees[i];
        }//for(int i=0;i<employeeCount;i++){
        string=string+"\nTotal Employees: "+employeeCount+"\nTotal Salary: "+totalSalary()+"\nAverage Salary: "+averageSalary()+"\nTotal Employees: "+getEmployeeCount();
        return string;
    }//public String toString(){

    public Employee whoIs(int employeeID){                                      //returns employee object based on first employeed ID
        for(Employee employee:employees){
            if(employee.getID()==employeeID){
                return employee;
            }//if(employee.getID()==employeeID){
        }//for(Employee employee:employees){
        return null;                                                            //returns null if no employee exists with searched ID
    }//public Employee whoIs(int employeeID){

    public double totalSalary(){                                                //adds up the salaries for all the employees
        double total=0.0;
        for(Employee employee:employees){
            total=total+employee.getSalary();
        }//for(Employee employee:employees){
        return total;
    }//public double totalSalary(){

    public double averageSalary(){                                              //averages the salary of all employees
        return (employeeCount==0)?0:totalSalary()/employeeCount;                //return 0 if no employees otherwise the average of all employees
    }//public double averageSalary(){
}//public class Department {