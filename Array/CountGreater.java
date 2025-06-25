/*
 Problem Statement: Given n length Array, You have to count total no. of elements in the array having atleast 1 element greater than itself.
 */

import java.util.Scanner;

public class CountGreater {
  public static void main(String[] args) {
       
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        
        int[] arr = new int[size];
        
        for(int i=0;i<size;i++){
            arr[i] = scn.nextInt();
        }
        
        //calculate max element
        int max = arr[0];
        for(int j=1;j<size;j++){
            if(arr[j] > max){max = arr[j];}
        }
        
        //count total occurance of max element
        int count =0;
        for(int k=0;k<size;k++){
            if(arr[k] ==max){
                count++;
            }
        }
        
        int totalNumber = arr.length - count;
        System.out.println(totalNumber);
        scn.close();
    }
    
}
