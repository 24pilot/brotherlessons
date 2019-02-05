/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer1;

//import javax.swing.*;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

/**
 *
 * @author user
 */
public class DataTest1 {

    JFrame frame;

    /**
     *
     */
    public void go() {

        frame = new JFrame();
        JButton button = new JButton("May I press this key???");
        button.addActionListener(new FirstListener());
        frame.getContentPane().add(BorderLayout.CENTER, button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setSize(200, 200);
        frame.setVisible(true);

    }
}
