/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exeptions;

/**
 *
 * @author user
 */
class MyClass {

    public void MyMethod() throws Exception {
        Exception exception = new Exception("My Exeption");
        throw exception;
    }
}

public class exl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 1, n = 2;
//        try {
//            a=a/(2-n);
//            System.out.println("Result is "+a);
//        } catch (Exception e) {
//         //   System.out.println("Catching exeptions " +e + " ----->> "+e.getMessage());
//        }

//        Exception ex = new Exception("My Exeption");
//        try {
//          if (true)  throw ex;
//            System.out.println("All OK");
//        } catch (Exception e) {
//            System.out.println("Catching exeptions " +e + " ----->> "+e.getMessage());
//        }
//            
        try {
            MyClass instance = new MyClass();
            instance.MyMethod();
        } catch (Exception e) {
            System.out.println("Catching exeptions " + e.getMessage());
            System.out.println("Stack trace: ");
            e.printStackTrace();
        }
    }

}
