/*
 Problem Statement: Given an array of length N, reverse the whole array.

 e.g. N = 4 array = {4,2,6,9}
 Expected Output: {9,6,2,4}
 */

import java.util.Scanner;

public class ReverseArray {
  
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int size = scn.nextInt();

    int[] arr = new int[size];

    //take array element from user
    for(int i=0;i<size;i++){
      arr[i] = scn.nextInt();
    }

    //reverse the array
    int sp =0;
    int ep = arr.length -1;
    while (sp<ep) {
      int temp = arr[sp];
      arr[sp] = arr[ep];
      arr[ep] = temp;
      sp++;
      ep--;
    }

    for(int j=0;j<size;j++){
    System.out.print(arr[j]+" ");}
    scn.close();
  }
}
