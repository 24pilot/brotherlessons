/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

/**
 *
 * @author user
 */
public class DatabaseRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Database database = new Database();
        Developer developer = new Developer(
                new InsertCommand(database), 
                new UpdateCommand(database)
        );
        developer.insertRecord();
        developer.updatetRecord();
        
        
        
    }
    
}
