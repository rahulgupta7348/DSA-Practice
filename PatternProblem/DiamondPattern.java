/*
 Problem Statement: Given an integer N as number of rows, print below diamond pattern.
 for e.g. N=3;
  *
* * *
  *

 */

import java.util.Scanner;

public class DiamondPattern {
  public static void main(String[] args) {
    //take integer
    Scanner scn = new Scanner(System.in);
    int num =scn.nextInt();

    int nst = 1;
    int nsp = num/2;

    for(int i=1;i<=num;i++){
      for(int j=1;j<=nsp;j++){
        System.out.print(" ");
      }
      for(int k=1;k<=nst;k++){
        System.out.print("*");
      }
      if(i<=num/2){
        nsp--;
        nst=nst+2;
      }else{
        nsp++;
        nst= nst-2;
      }
      System.out.println();
    }
    
    scn.close();
  }
}
