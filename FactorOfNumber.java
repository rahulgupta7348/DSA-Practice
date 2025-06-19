/*Problem Statement: Given a positive number, print all the factor of that number.*/

import java.util.Scanner;

public class FactorOfNumber {

  public static void main(String args[]){

    //take number
    Scanner scn = new Scanner(System.in);
    int number = scn.nextInt();
    int count =0;
    for(int i=1;i<=number;i++){
      if(number%i==0){ 
        System.out.println(i);
        count++;
      }
    }
    System.out.println("Total number of Factors: "+count);
    scn.close();
  }
}
