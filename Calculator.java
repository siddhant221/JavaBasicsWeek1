import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator {
    
     void add(float num1,float num2)
     {
          float op = num1+num2;
          String format= String.format("%.2f",op);
          System.out.println(format);
     }
      void sub(float num1,float num2)
     {
          float op = num1-num2;
          String format= String.format("%.2f",op);
          System.out.println(format);
     }
      void mul(float num1,float num2)
     {
          float op = num1*num2;
          String format= String.format("%.2f",op);
          System.out.println(format);
     }
      void div(float num1,float num2)
     {
          float op = num1/num2;
          String format= String.format("%.2f",op);
          System.out.println(format);
     }
     public static void main(String[] args) {
          Calculator c= new Calculator();
          c.add(12, 33);
          c.sub(3, 2);
          c.mul(34, 32);
          c.div(90,32);
     }
}




/*
 psudocode

 class calc
 {
     scanner 
     num1,2 and op float

     void add(num1,num2)
     {
          op=num1+2;
     }
     main()
     calc ob
     ob.add()
 }
 */