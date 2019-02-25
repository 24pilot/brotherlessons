/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fasade0;

/**
 *
 * @author user
 */
public class Developer {
    public void doBeforeDeadline(BugTracker bugTracker){
    
        if (bugTracker.isActiveSprint()) {
            System.out.println("Developerv is working...");
        } else {
            System.out.println("Developerv is reading docs...");
        }
    
    }
}
