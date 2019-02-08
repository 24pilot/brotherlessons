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
public class Ex7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 1, n = 2;
        
        try {
            System.out.println(" Try dividing by zero ");
            System.out.println("a / (2-n)"+ (a/(2-n)));
            
        } catch (Exception e) {
            System.out.println("Processing exeption ");
            System.out.println(e.getMessage());
        } finally {
            System.out.println(" Block Finally");
        }
        System.out.println("End of code.");
    }
    
}
