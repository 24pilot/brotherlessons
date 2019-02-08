/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator1;



/**
 *
 * @author user
 */
public class Task {
    public static void main(String[] args) {
        Developer developer1 =  new PhpDeveloper();
        Developer developer2 =  new TesterPHPDeveloper(developer1);
        Developer developer3 =  new ManagerPhpDeveloper(developer2);
        Developer developer = new SupporterManagerTesterPHPDeveloper(new ManagerPhpDeveloper(new TesterPHPDeveloper(new PhpDeveloper())));
        System.out.println(developer.makeJob());
        System.out.println(developer1.makeJob());
       System.out.println(developer2.makeJob());
System.out.println(developer3.makeJob());
  }
}
