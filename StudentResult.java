/*Problem Statement: Take input mark scored by a student.Print "Pass" if mark >= 35, otherwise print "fail" */

import java.util.Scanner;

public class StudentResult {

  public static void main(String args[]){
    Scanner scn = new Scanner(System.in);

    System.out.println("Enter the mark:");
    int mark = scn.nextInt();
    if(mark>=35){
      System.out.println("Pass");
    }else{
      System.out.println("Fail");
    }
    scn.close();
  }
}
