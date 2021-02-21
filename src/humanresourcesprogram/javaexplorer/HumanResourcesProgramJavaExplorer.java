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
public class HumanResourcesProgramJavaExplorer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Department weps = new Department("Weps");                               //test initialization
        System.out.println(weps);
        weps.addEmployee(new Employee("Jason",5055,25000.00));                  //add new employee
        weps.addEmployee(new Employee("John",6066,50000.00));                   //add new employee
        weps.addEmployee("Weps",01,100000.00);                                  //add new employee using new method
        System.out.println(weps);                                               //test toString() method
        System.out.println("");

        System.out.println(weps.whoIs(1213));                                   //test whoIs return null
        System.out.println(weps.whoIs(6066));                                   //test whoIs return employee
        System.out.println(weps.averageSalary());                               //test averageSalary
        System.out.println(weps.totalSalary());                                 //test totalSalary
        Department cs = new Department();                                       //new blank department
        System.out.println(cs);                                                 //test toString with no employees/dept name
        for(Employee emp:weps.getEmployees()){                                  //test getEmployees method
            System.out.println(emp);
        }//for(Employee emp:weps.getEmployees()){
    }//public static void main(String[] args) {
}//public class HumanResourcesProgramJavaExplorer {