/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command2;

/**
 *
 * @author user
 */
public class LightOffCommand implements Command{
    Light light;
    
    public LightOffCommand(){
    
        this.light = light;
    }

    @Override
    public void execute() {

        light.off();


    }
    
}
