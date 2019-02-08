/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator1;

/**
 *
 * @author user
 */
public class ManagerPhpDeveloper extends DeveloperDecorator{
    
    public ManagerPhpDeveloper(Developer developer) {
        super(developer);
    }
    public String implForClient(){
    return "  .... implements for client ...";
    }
    
    public String makeJob(){
    return super.makeJob() + implForClient();
    }
}
