/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegExNumbers;

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
                String txt = "Lorem 466 ipsum dolor 111 499 sit amet, consectetur adipiscing elit. Fusce dapibus tellus nec nulla gravida, sed congue nunc hendrerit. Integer interdum elementum lorem id rutrum. Ut sit amet interdum mauris. Phasellus mollis ex eleifend lacus molestie dictum. Fusce blandit, ligula non condimentum maximus, massa nisi ullamcorper odio, et vehicula nisl nunc nec orci. Sed neque diam, gravida eu blandit ullamcorper, porttitor non lorem. Etiam sagittis diam a dolor feugiat placerat. Suspendisse enim turpis, imperdiet in tellus sit amet, consectetur porta magna. Suspendisse odio nulla, imperdiet eget augue in, pulvinar hendrerit nunc. Aenean ut cursus tellus, nec vehicula ante. Vestibulum ornare erat non ante tempus, eu aliquet felis dapibus. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Mauris eget arcu imperdiet, laoreet erat non, imperdiet leo. Sed arcu mi, ornare non leo sed, faucibus semper nunc.";
        //String[] lines = new String[100];
        //(^[4-6][0-9][0-9]$)
       Pattern regex = Pattern.compile("[4-6][0-9][0-9]");
       Matcher m = regex.matcher(txt);
        while (m.find()) {
            System.out.println(m.group()+" ");
            
        }
        // TODO code application logic here
    }
    
}
