/*
  Problem Statement: Given the value of "n" and "r", calculate the value of nCr.
  nCr = fact(n)/fact(r)*fact(n-r);
 */

import java.util.Scanner;

public class nCr {
  
  public static void main(String[] args) {
    
    // take value from user
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int r = scn.nextInt();

    int nfact = fact(n);
    int rfact = fact(r);
    int nmrfact = fact(n-r);

    int result = nfact/(rfact*nmrfact);
    System.out.println("nCr value is: "+result);
    scn.close();
  }
  
  public static int  fact(int num){
    int ans = 1;
    for(int i=1;i<=num;i++){
      ans = ans*i;
    }
    return ans;
  } 
}
