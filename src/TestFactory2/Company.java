/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestFactory2;

/**
 *
 * @author user
 */
public class Company {
        void createSoftware() {
        System.out.println("Starting company activity");
        Employee[] emploee = new Employee[3];
        emploee[0] = new Designer();
        emploee[1] = new Programmer();
        emploee[2] = new Tester();
        
        for (Employee employeeEach : emploee) {
            employeeEach.doWork();
        }    
        }    
}
