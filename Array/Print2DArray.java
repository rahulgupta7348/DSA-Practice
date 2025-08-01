/*
Problem Statement: Take row, colunm and array element from user, and print the 2d array in row wise;
example:
3 4
10 11 12 13 14 15 16 17 18 19 20 21

Output:
10 11 12 13 
14 15 16 17 
18 19 20 21
*/

import java.util.Scanner;

public class Print2DArray{
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int row = scn.nextInt();
    int col = scn.nextInt();

    //define a 2D array
    int[][] arr = new int[row][col];

    //take input
    for(int i=0;i<row;i++){
      for(int j=0;j<col;j++){
        arr[i][j] = scn.nextInt();
      }
    }

    //print 2D array rowwise
    for(int i=0;i<row;i++){
      for(int j=0;j<col;j++){
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
    scn.close();
  }
}