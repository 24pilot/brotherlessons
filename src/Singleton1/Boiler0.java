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
public class Boiler0 {
    private boolean empty;
    private boolean boiled;
    public static Boiler0 uniqueInstance;
    
    private Boiler0(){
    empty = true;
    boiled = false;
        System.out.println("New Boiler created");
    }
    
    public static Boiler0 getInstance() {
        if(uniqueInstance==null){
        uniqueInstance = new Boiler0();
            System.out.println("The new instance of Boiler0");
        } else System.out.println("No!!! Boiler0 is enough");
        
        return uniqueInstance;
    }
    
    public void fill(){
    
        if (isEmty()){
        empty = false;
        boiled = false;
            System.out.println("Boiler is filled");
        }
        
    }
    
    public void drain(){
    
    
        if (!isEmty() && isBoiled()){
        empty = true;
            System.out.println("Boiler is empty");
        }
        
        
    }
    
    public void boil(){
    
    
        if (!isEmty() && !isBoiled()){
        boiled = true;
            System.out.println("Boiling...");
        }
        
        
    }   
    
    
    private boolean isEmty() {
return empty;
        }

    private boolean isBoiled() {
return boiled;
    }
    
}
