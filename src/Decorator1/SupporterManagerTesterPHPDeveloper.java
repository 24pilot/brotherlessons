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
public class SupporterManagerTesterPHPDeveloper extends DeveloperDecorator{
    
    public SupporterManagerTesterPHPDeveloper(Developer developer) {
        super(developer);
    }
    public String supportForClient(){
    return " ... support PHP code for cxlient... ";
    }
    
    @Override
        public String makeJob(){
    return super.makeJob() + supportForClient();
    }
}
