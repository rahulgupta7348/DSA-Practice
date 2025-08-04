/*
Problem Statement:
Given an arr[N], every element appears twice except for one element which appears once, find that unique element.

example:
input: arr[7] : [6,8,8,7,7,10,6]
output: 10
*/

import java.util.Scanner;

public class findUniqueElementArr {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int size = scn.nextInt();
    int[] arr = new int[size];

    //take input array
    for(int i=0;i<size;i++){
      arr[i] =scn.nextInt();
    }

    int ans =0;
    for(int j=0;j<arr.length;j++){
      ans = ans^arr[j];
    }
    System.out.println("Unique Number is: "+ans);
    scn.close();
  }
}
