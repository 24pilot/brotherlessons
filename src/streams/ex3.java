/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class ex3 {
    static class Recipe implements Runnable{

        @Override
        public void run() {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ex3.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            System.out.println("...coocking by recipe...");
           // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //        System.out.println(Thread.currentThread().getName());
        Thread thread = new Thread(new Recipe());
        thread.start();
        thread.setName("Coock");
        System.err.println(thread.getName());
        System.err.println(Thread.currentThread().getName());
        
    }
    
}
