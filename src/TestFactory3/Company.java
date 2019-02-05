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
public abstract class Company {

    Employee[] getEmploees() {
        return null;
    };
    
    void startWorking(Employee[] emploeers) {
        for (Employee emploeer : emploeers) {
            emploeer.doWork();
        }
//emploeers.forEach((emp) -> {
//            emp.doWork();
//        });
    };
}