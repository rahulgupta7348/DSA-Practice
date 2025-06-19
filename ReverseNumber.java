/*Problem Statement: Given an integre N, print all digits from right to left.*/

import java.util.Scanner;

public class ReverseNumber {

  public static void main(String args[]){

    //take number from user
    Scanner scn = new Scanner(System.in);
    int number = scn.nextInt();

    if(number<0){number = number * -1;}
    while (number>0) {
      int lastDigit = number%10;
      System.out.print(lastDigit);
      number =number/10;
    }

    scn.close();
  }
}
