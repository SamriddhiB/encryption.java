/*Implement Caesar Cipher */

import java.util.*;
public class encryption {
public static void main(String args[]) {
  Scanner sc = new Scanner(System.in);
  System.out.println(" Input the text message : ");
  String text = sc.nextLine();
  System.out.println(" Enter the value by which  each character in the text  has to be shifted : ");
  int shift = sc.nextInt();
  String cipher = "";
  char letter;
  for(int i=0; i < text.length();i++) 
  {  
  letter = text.charAt(i);
  if(letter >= 'a' && letter <= 'z') 
  { 
  letter = (char) (letter + shift);
  if(letter > 'z') { 
  letter = (char) (letter+'a'-'z'-1);
  }
  cipher = cipher + letter;
  }
  else if(letter >= 'A' && letter <= 'Z') {
  letter = (char) (letter + shift);     
  if(letter > 'Z') {
  letter = (char) (letter+'A'-'Z'-1);
  }
  cipher = cipher + letter;
  }
  else {
  cipher = cipher + letter;   
  }
  }
  System.out.println(" cipher : " + cipher);
 }
}