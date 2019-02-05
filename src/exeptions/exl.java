/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exeptions;

/**
 *
 * @author user
 */
public class exl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=1, n=2;
        try {
            a=a/(2-n);
            System.out.println("Result is "+a);
        } catch (Exception e) {
         //   System.out.println("Catching exeptions " +e + " ----->> "+e.getMessage());
        }
        
        
    }
    
}
