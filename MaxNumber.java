/*Problem Statement: Given three number, find the max number*/

import java.util.Scanner;

public class MaxNumber{

  public static void main(String args[]){

    //take input
    Scanner scn = new Scanner(System.in);
    int num1 = scn.nextInt();
    int num2 = scn.nextInt();
    int num3 = scn.nextInt();

    if(num1>num2 && num1>num3){
      System.out.println("Max number is: "+num1);
    }else if(num2>num1 && num2 >num3){
      System.out.println("Max number is: "+num2);
    }else{
      System.out.println("Max number is: "+num3);
    }
    scn.close();
  }
}
