import java.util.Scanner;

public class EligibleForDrive {

  public static void main(String args[]){ 
  Scanner scn = new Scanner(System.in);
  int age =scn.nextInt();

  if(age>18){
    System.out.println("You are eligible for driving.");
  }
  scn.close();
}
}
