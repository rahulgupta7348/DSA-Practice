/*
Problem Statement: Given a string str,reverse and print it.
example: input :apple output: elppa
 */

import java.util.Scanner;

public class ReverseString {
  public static void main(String[] args) {
   Scanner scn = new Scanner(System.in);
   String str = scn.nextLine();
   System.out.print(ReverseStr(str));
   scn.close(); 
  }

  public static String ReverseStr(String str){
  char[] ch = str.toCharArray();
    int sp =0;
    int ep =ch.length -1;
    while(sp<ep){
      char temp = ch[sp];
      ch[sp] = ch[ep];
      ch[ep] = temp;
      sp++;
      ep--;
    }
    String ans = new String(ch);
    //  String ans = str.valueOf(ch);
    return ans;
  }
}
