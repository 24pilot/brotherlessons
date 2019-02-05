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
public class BuildingCompany extends Company{
                      
    Employee[] getEmploees(){
        int i;
        System.out.println("");
        System.out.println("Starting company activity "+BuildingCompany.class.getSimpleName() + "\n");
        Employee[] employee = new Employee[14];// Example no colletions


        for (i=0; i<=9; i++){
         employee[i] = new Builder();   
        }
        employee[10] = new Master();
        employee[11] = new Director();
        employee[12] = new Electric();
        
        return employee;
    }
}
