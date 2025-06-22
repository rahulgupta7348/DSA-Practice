/*
  Problem Statement: Given an integer number, check wheather it's a palindrome number or not.
 */

import java.util.Scanner;

public class isPalindrome {

  public static void main(String args[]){
    //take integer
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();

    boolean isPalindromeNum = palindrome(num);
    if(isPalindromeNum){
      System.out.println("Palindrome Number: "+num);
    }else{System.out.println("Not Palindrome: "+num);}
    scn.close();
  }
  public static boolean palindrome(int num){
    int originalNum = num;
    int ans =0;
    while(num>0){
      int lastDigit = num % 10;
      ans = ans*10+lastDigit;
      num = num/10;
    }
    return ans ==originalNum;
  }
}