/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestFactoryWithCollections;

import TestFactory3.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class BuildingCompany extends Company{
                      
    @Override
    List getEmploees(){
        int i;
        System.out.println("");
        System.out.println("Starting company activity "+BuildingCompany.class.getSimpleName() + "\n");
        //Employee[] employee = new Employee[14];// Example no colletions
        List employee = new ArrayList();
        employee.add(new Master());
        employee.add(new Electric());
        employee.add(new Director());
        for (int j = 0; j < 10; j++) {
            employee.add(new Builder());
            
        }

//        for (i=0; i<=9; i++){
//         employee[i] = new Builder();   
//        }
//        employee[10] = new Master();
//        employee[11] = new Director();
//        employee[12] = new Electric();
//        
        return employee;
    }
}
