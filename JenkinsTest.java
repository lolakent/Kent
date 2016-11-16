/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jenkinstest;

/**
 *
 * @author Lola
 */
public class JenkinsTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 456;
        int y = 123;
        int addition, substraction, multiplication, divition = 0;
        
        addition = x + y;
        substraction = x - y;
        multiplication = x * y;
        divition = x / y;
        
        System.out.println("Addition of " + x  + " + " + y  + " is " + addition);
        System.out.println("Substraction of " + x  + " - " + y  + " is " + substraction);
        System.out.println("Multiplication of " + x  + " x " + y  + " is " + multiplication);
        System.out.println("Divition of " + x  + " / " + y  + " is " + divition);
    }
    
}
