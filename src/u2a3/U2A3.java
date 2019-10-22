/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package u2a3;
import java.util.Scanner;
/**
 *
 * @author demar3553
 */
public class U2A3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner kinput = new Scanner(System.in);
        
        int numMarks = 0;
        double[] marks;
        double sum = 0;
        double average;

            System.out.println(" ~~~~~~~~~~~~~~~~~ School Mark Calculator ~~~~~~~~~~~~~~~~~ ");
 
            System.out.println("How many classes do you want to calculate your average from?");
            numMarks = kinput.nextInt();
        
            marks = new double[numMarks];
        
            System.out.println("Enter your marks one at a time");
            System.out.println("Then click enter");
            for(int i = 0; i < numMarks; i++){
            marks[i] = kinput.nextDouble();
            sum += marks[i];
        }
        
             System.out.println("The marks you entered are:");
             for(int i = 0; i < numMarks; i++){
             System.out.println(marks[i]);
        }
        
          average = sum/numMarks;
          average = (int)(average*100);
          average/=100;
        
        
        System.out.println("Your average is: " + average);
    }
    
}
