/*
 Problem Statement: Given an integer N, find the factorial of N.
 e.g N = 4;
 Expected Output: 24;
 */

import java.util.Scanner;

public class FactorialNumber {
  
  public static void main(String[] args) {
    //take integer
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();
    
    int ans = 1;
    for(int i=1;i<=num;i++){
      ans =ans*i;
    }
    System.out.println("Factorial of given integer: "+ans);
    scn.close();
  }
}
