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
        Department weps = new Department("Weps");
        System.out.println(weps);
        weps.addEmployee(new Employee("Jason",5055,25000.00));
        weps.addEmployee(new Employee("John",6066,50000.00));
        weps.addEmployee("Weps",01,100000.00);
        System.out.println(weps);
        System.out.println("");

        System.out.println(weps.whoIs(1213));
        System.out.println(weps.averageSalary());
        System.out.println(weps.totalSalary());
        Department cs = new Department();
        System.out.println(cs);
    }

}