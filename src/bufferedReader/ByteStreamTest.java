/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bufferedReader;

import java.io.IOException;

/**
 *
 * @author user
 */
public class ByteStreamTest {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        while (true) {            
            int byteValue = System.in.read();
            System.out.println(byteValue);
        }
    }
    
}
