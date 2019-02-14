/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton1;

/**
 *
 * @author user
 */
public class Controller0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Boiler0 boiler = new Boiler0();
        Boiler0 boiler = Boiler0.getInstance();
        boiler.fill();
        boiler.boil();
        boiler.drain();
         Boiler0 boiler2 = Boiler0.getInstance();
// TODO code application logic here
        
    }
    
}
