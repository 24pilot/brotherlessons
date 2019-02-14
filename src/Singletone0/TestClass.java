/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singletone0;

/**
 *
 * @author user
 */
public class TestClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyObject o = new MyObject();
        MyObject o2 = new MyObject();
        
    //    MyObjectClosed0 o3 = new MyObjectClosed0();
        
        MyObjectClosed1 o4 = MyObjectClosed1.getInstance();
        MyObjectClosed1 o5 = MyObjectClosed1.getInstance();
        
        Singletone s1 = Singletone.getInstance();
        Singletone s2 = Singletone.getInstance();
        
    }
    
}
