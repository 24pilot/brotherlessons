/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegExFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                        String txt = "C:\\Users\\user\\Desktop\\oleksandr";
        //String[] lines = new String[100];
        //(^[4-6][0-9][0-9]$)
       Pattern regex = Pattern.compile("[^\\\\]+$");
       Matcher m = regex.matcher(txt);
        while (m.find()) {
            System.out.println(m.group()+" ");
        // TODO code application logic here
    }
    
    }
}
