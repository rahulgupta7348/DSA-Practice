/*
 Problem Statement: Given an array of size 5, swap indx1 and indx2 of array = {3,5,8,12,43} 
 take the value of indx1 and indx2 from user.
 e.g. indx1 = 1 and indx2 = 3
 Expected array after swaping= {3,12,8,5,43}
 */

import java.util.Scanner;

public class SwapIndex {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int indx1 = scn.nextInt();
    int indx2 = scn.nextInt();

    int[] arr = {3,5,8,12,43};

    int temp = arr[indx1];
    arr[indx1]=arr[indx2];
    arr[indx2] =temp;

    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    scn.close();
  }
}
