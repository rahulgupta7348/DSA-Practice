/*
 Problem Statement: Take the size and element of an array from user and find the max element of the array.
 for e.g. size = 4 array = {-10,-20,-30,-40}
 Expected Output: -10
 */

import java.util.Scanner;

public class MaxOfArray {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int size = scn.nextInt();

    int[] arr = new int[size];

    for(int i =0;i<size;i++){
      arr[i] = scn.nextInt();
    }

    //find the max element
    int max = arr[0];
    for(int j =0;j<size;j++){
      if(arr[j]>max){max=arr[j];}
    }
    System.out.println("The Max element of given array is: "+max);
    scn.close();
  }
}
