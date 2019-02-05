/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestFactory3;

/**
 *
 * @author user
 */
public class CleaningCompany extends Company{
     Employee[] getEmploees(){
        System.out.println("");
        System.out.println("Starting company activity"+CleaningCompany.class.getSimpleName() + "\n");
        Employee[] employee = new Employee[4];// Example no colletions
        employee[0] = new Cleaner();
        employee[1] = new Manager();
        employee[2] = new Cleaner();
        employee[3] = new Cleaner();
        
        return employee;
    }
}
