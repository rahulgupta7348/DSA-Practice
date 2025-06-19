/*
 * Problem Statement: Given an integer N, Print the below Pattern:
   e.g. N=3;
   *
   **
   ***
 */

import java.util.Scanner;

public class RightAngledPattern {
  public static void main(String[] args) {
    //take number
    Scanner scn = new Scanner(System.in);
    int num =scn.nextInt();

    int nst =1;
    for(int i=1;i<=num;i++){
      for(int j=1;j<=nst;j++){
        System.out.print("*");
      }
      nst++;
      System.out.println();
    }
    scn.close();
  }
}
