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

    public Department (){
        this.employees=new Employee[maxEmployees];
        for(int i=0;i<maxEmployees;i++){
            employees[i]=new Employee("",0,0.0);
        }
    }

    public Department(String name) {
        this.deptName = name;
        this.employees=new Employee[maxEmployees];
        for(int i=0;i<maxEmployees;i++){
            employees[i]=new Employee("",0,0.0);
        }
    }

    public int getEmployeeCount(){
        return employeeCount;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void addEmployee (Employee employee){
        if(employeeCount<maxEmployees){
            employees[employeeCount]=employee;
            employeeCount++;
        }
    }

    public void addEmployee (int ID){
        if(employeeCount<maxEmployees){
            employees[employeeCount]=new Employee(ID);
            employeeCount++;
        }
    }

    public void addEmployee (int ID,String name,double salary){
        if(employeeCount<maxEmployees){
            employees[employeeCount]=new Employee(ID,name,salary);
            employeeCount++;
        }
    }

    public void addEmployee (String name,int ID,double salary){
        if(employeeCount<maxEmployees){
            employees[employeeCount]=new Employee(ID,name,salary);
            employeeCount++;
        }
    }

    public Employee[] getEmployees(){
        return employees;
    }

    @Override
    public String toString(){
        String string = "Department name: "+deptName;
        for(int i=0;i<employeeCount;i++){
            string=string+"\n"+employees[i];
        }
        string=string+"\nTotal Employees: "+employeeCount+"\nTotal Salary: "+totalSalary()+"\nAverage Salary: "+averageSalary()+"\nTotal Employees: "+getEmployeeCount();
        return string;
    }

    public Employee whoIs(int employeeID){
        for(Employee employee:employees){
            if(employee.getID()==employeeID){
                return employee;
            }
        }
        return null;
    }

    public double totalSalary(){
        double total=0.0;
        for(Employee employee:employees){
            total=total+employee.getSalary();
        }
        return total;
    }

    public double averageSalary(){
        return (employeeCount==0)?0:totalSalary()/employeeCount;
    }
}