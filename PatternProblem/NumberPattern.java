/*
 Problem Statement: Given an integer N, print below pattern:
 for e.g. N=3
 Expected Output: 
 1
 2 3
 4 5 6
 */

import java.util.Scanner;

public class NumberPattern {
  public static void main(String[] args) {
    //take integer
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();

    int count =1;
    int nst =1;

    for(int i=1;i<=num;i++){
      for(int j=1;j<=nst;j++){
        System.out.print(count +" ");
        count++;
      }
      nst++;
      System.out.println();
    }
    scn.close();
  }
}
