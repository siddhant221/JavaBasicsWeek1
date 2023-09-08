/*
 * Create a program that calculates the area of a rectangle given its length and width.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Area {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("");
          float length=sc.nextFloat();//length 
          float breadth = sc.nextFloat();//breadth

          float rect= length*breadth;//formula to calc area of rect
          /*from lines 17-18 i rounded off the rect result and put up to 2 decimal places.  */
         // DecimalFormat decimalFormat= new DecimalFormat("0.00");
         // String formattedrecString= decimalFormat.format(rect);

          /*another way to convert to 2 decimal places is  */
          String formattedRect = String.format("%.2f",rect);
          System.out.println(formattedRect);


     }
     
}
