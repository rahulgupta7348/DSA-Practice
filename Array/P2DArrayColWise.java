/*
 Problem Statement: Take row, colunm and array element from user, and print the 2d array in column wise;
example:
3 4
10 11 12 13 14 15 16 17 18 19 20 21

Output:
10 14 18 
11 15 19 
12 16 20 
13 17 21 
 */

import java.util.Scanner;

public class P2DArrayColWise {
  public static void main(String[] args) {
   Scanner scn = new Scanner(System.in);
   int row = scn.nextInt();
   int col = scn.nextInt();

   //define a 2d array
   int[][] arr = new int[row][col];

   //take input
   for(int i=0;i<row;i++){
    for(int j=0;j<col;j++){
      arr[i][j] = scn.nextInt();
    }
   }

    for(int i=0;i<row;i++){
    for(int j=0;j<col;j++){
     System.out.print(arr[i][j]+" ");
    }
    System.out.println();
   }
    
   //print a 2d array column wise
   for(int j=0;j<col;j++){
    for(int i=0;i<row;i++){
      System.out.print(arr[i][j]+" ");
    }
    System.out.println();
   }
   scn.close();
  }
}
