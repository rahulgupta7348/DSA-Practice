/*
Problem Statement: You have been given a positive number,identify whether the number is even or odd.
 example: 
 N = 8 => even
 N = 7 => odd
 
 Note: Use of +,-,*,/ or % is not allowed.
*/

import java.util.Scanner;
public class EvenorOddWithoutM {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int posNumber = scn.nextInt();

    if((posNumber&1)==0){
      System.out.println("Even Number");
    }else{
      System.out.println("Odd Number");
    }
    scn.close();
  }  
}
