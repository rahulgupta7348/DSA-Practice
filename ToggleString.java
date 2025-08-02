/*
Problem Statement:Given a char[] which contains only small and capital letters,toggle them.

example: 
input :mANgO
expected output: ManGo
*/

import java.util.Scanner;

public class ToggleString {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();
    char[] ch = str.toCharArray(); //convert string into char[string.length()].
    
    ToggleStr(ch);
    for(int i=0;i<ch.length;i++){
      System.out.print(ch[i]);
    }
    scn.close();
  }
  public static void ToggleStr(char[]ch){
     //toggle char
    for(int i=0;i<ch.length;i++){
      if(ch[i]>=65 && ch[i]<=90){
        ch[i] = (char)(ch[i]+32);
      }else{
        ch[i] =(char)(ch[i]-32);
      }
    }
    
  }
}
