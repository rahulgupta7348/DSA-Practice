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

    //print 2D array
    for(int i=0;i<row;i++){
      for(int j=0;j<col;j++){
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
    scn.close();
  }
}