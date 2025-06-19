/*Problem Statement: Given a number, print "Prime" if number is prime else print "Not Prime." */

import java.util.Scanner;

public class PrimeNumber {

  public static void main(String[] args) {
    
    //take number
    Scanner scn = new Scanner(System.in);
    int number = scn.nextInt();
    int count =0;
    for(int i=1;i<=number;i++){
      if(number%i==0){
        count=count+1;
      }
    }
    if(count==2){
      System.out.println("Prime");
    }else{
      System.out.println("Not Prime");
    }
    scn.close();
  }
}
