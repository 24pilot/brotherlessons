/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class StatTest {

    /**
     * @param args the command line arguments
     */
    public class Test3 {
        {
            System.out.println("We are in block");
        }
        static {
            System.out.println("We are STATIC in block 1");
        }
    }
     
    public Test3() {
        System.out.println("Constructor worked");
    }
    {
        System.out.println("We are in last block 2");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Test3 test = new Test3();
        Test3 test2 = new Test3();
    }
    
}
