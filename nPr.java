/*
 Problem Statement: Given the value of "n" and "r", calculate the value of nPr.

 nPr = fact(n)/fact(n-r);
 */

import java.util.Scanner;

public class nPr {
  
  public static void main(String[] args) {
    
    //take value
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int r = scn.nextInt();

    int nfact = fact(n);
    int nmrfact = fact(n-r);

    int result = nfact/nmrfact;
    System.out.println("The nPr value: "+result);
    scn.close();
  }

  public static int fact(int num){
    int ans = 1;

    for(int i=1;i<=num;i++){
      ans = ans*i;
    }
    return ans;
  }
}
