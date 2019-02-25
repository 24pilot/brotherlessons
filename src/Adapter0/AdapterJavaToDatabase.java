/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter0;

/**
 *
 * @author user
 */
public class AdapterJavaToDatabase extends JavaApplication implements Database{

    @Override
    public void insert() {
    saveObject(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update() {
        updateObject();//To change body of generated methods, choose Tools | Templates.
    }
    
}
