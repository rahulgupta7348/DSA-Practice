/*
Problem Statement: Take row, colunm and array element from user, and print the 2d array in waveform;
example:
3 4
10 11 12 13 14 15 16 17 18 19 20 21

Actual Matrix:
10 11 12 13 
14 15 16 17
18 19 20 21

Expected Matrix:
10 11 12 13
17 16 15 14
18 19 20 21 
*/

import java.util.Scanner;

public class PMatrixWaveform {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int row = scn.nextInt();
    int col = scn.nextInt();

    //define matrix
    int[][] arr = new int[row][col];

    //take input
    for(int i=0;i<row;i++){
      for(int j=0;j<col;j++){
        arr[i][j] = scn.nextInt();
      }
    }

    //print matrix in waveform
    for(int i=0;i<row;i++){
      if(i%2==0){
        for(int j=0;j<col;j++){
          System.out.print(arr[i][j]+" ");
        }
      }else{
        for(int j=col-1;j>=0;j--){
          System.out.print(arr[i][j]+" ");
        }
      }
      System.out.println();
    }
    scn.close(); 
  }
}
