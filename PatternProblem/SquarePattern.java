/*Problem Statement: Given an integer N, print N*N pattern using "*". */

import java.util.Scanner;

public class SquarePattern {
  public static void main(String[] args) {
    //take integer
    Scanner scn = new Scanner(System.in);
    int N =scn.nextInt();
 for(int i=1;i<=N;i++){
  for(int j=1;j<=N;j++){
    System.out.print("*");
  }
  System.out.println();
 }
    scn.close();
  }
}
