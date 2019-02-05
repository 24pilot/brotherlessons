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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Company gameCompany = new GameDevCompany();
        Employee[] computerWorkers= gameCompany.getEmploees();
        gameCompany.startWorking(computerWorkers);
        
        Company cleanCompany = new CleaningCompany();
        Employee[] cleanWorkers= cleanCompany.getEmploees();
        cleanCompany.startWorking(cleanWorkers);
        
        Company buildCompany = new BuildingCompany();
        Employee[] buildWorkers= buildCompany.getEmploees();
        buildCompany.startWorking(buildWorkers);
        
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
