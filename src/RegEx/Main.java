/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
       
        // TODO code application logic here
        boolean result = false;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter EMAIL -> ");
        String str = br.readLine();
        System.out.println("EMail is->"+MyRegEx.checkEmail(str));
        
        //checkIp
        System.out.println("Enter IP -> ");
        str = br.readLine();
        System.out.println("IP is->"+MyRegEx.checkIp(str));
        
        System.out.println("You're not autorised ");
        while (!result){
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Input PASSWORD -> ");
        str = br.readLine();
        result = MyRegEx.checkPass(str);
         System.out.println("Password is -> "+MyRegEx.checkPass(str));
    }
    
    }
}
