/* Problem Statement: Read a number and check if number is even or odd. */

import java.util.Scanner;

public class EvenOrOdd {

  public static void main(String args[]){

    //read a number
    Scanner scn = new Scanner(System.in);
    int number = scn.nextInt();

    //check number
    if(number%2==0){
      System.out.println("Even Number");
    }else{
      System.out.println("Odd Number");
    }
   scn.close();
  }
}
