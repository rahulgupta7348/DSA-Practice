/*
 Problem Statement: Take the size and array element from user, calculate the sum of all array element.

 for e.g. size = 4 and array = {2,5,8,9}
 Expected Output : 24
 */

import java.util.Scanner;

public class SumOfArray{
  
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int size = scn.nextInt();

    int[] arr = new int[size];
    
    //take array value from user
    for(int i = 0;i<size;i++){
      arr[i] = scn.nextInt();
    } 

    //sum of all element of given array
    int sum = 0;
    for(int j=0;j<size;j++){
      sum = sum + arr[j];
    }
    System.out.println("Sum of all array element: "+sum);
    scn.close();
  }
}