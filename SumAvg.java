import java.util.Scanner;
/*
 * Problem Statement: Calculate Sum and Average

Problem Description:
Write a Java program that calculates the sum and average of three real numbers.

Input:
The input consists of three real numbers, num1, num2, and num3, separated by spaces (-10^9 <= num1, num2, num3 <= 10^9).

Output:
Print two lines of output:

    The sum of the three numbers, rounded to two decimal places.
    The average of the three numbers, rounded to two decimal places.

Example:

Input: 3.5 7.2 -2.8

Output: 
Sum: 7.90
Average: 2.63

Note:

In the example above, the sum is calculated as 3.5 + 7.2 - 2.8 = 7.9, and the average is calculated as (3.5 + 7.2 - 2.8) / 3 = 2.63.

Participants are required to write code in Java that takes input, performs the necessary calculations, and produces the expected output. The code is then submitted and evaluated by the platform's automated testing system.

The specific wording and details of the question may vary, but this structure is typical for a simple programming task like finding the sum and average of three numbers in Java.
 */
public class SumAvg {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          float num1=sc.nextFloat();
          float num2=sc.nextFloat();
          float num3=sc.nextFloat();

          float sum = num1+num2+num3;
     
          String formatted=String.format("%.2f",sum);
          System.out.println("Sum: "+formatted);

          float avg = (num1+num2+num3)/3;
          String formattedAVg=String.format("%.2f",avg);
          System.out.println("Average: "+formattedAVg);


     }
     
}
