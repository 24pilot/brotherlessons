/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestFactoryWithCollections;

import java.util.List;

/**
 *
 * @author user
 */
public abstract class Company {

    List getEmploees() {
        return null;
    }

    ;
  
    void startWorking(List<Employee> emploeers) {
        emploeers.forEach((emp) -> {
            emp.doWork();
        });
    };
}
