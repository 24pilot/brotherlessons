/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exeptions;

import java.io.FileInputStream;

/**
 *
 * @author user
 */
public class Ext {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            throw new UserExeption();
        } catch (UserExeption userExeption) {
            System.out.println("Processing exeption. ");
            userExeption.method();
            
            try {
                FileInputStream fs = new FileInputStream("D:\\NonExistingFile.log");
            } catch (Exception exeption) {
                System.out.println(exeption.getMessage());
            }
            
        }
    }
    
}
