/*import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;*/
import java.util.Scanner;
public class beautifulbinary {
      public static void main(String[] args){
          Scanner sc =new Scanner(System.in);
          int length=sc.nextInt();
          String str=sc.next();
          int count=0;
          int i=0;
          while(i<=length-3){
              if(str.charAt(i+0)=='0' & str.charAt(i+1)=='1' & str.charAt(i+2)=='0'){
                  count++;
                  i=i+3;   
              }
              else{
                  i=i+1;
              }
          }
          System.out.println(count);
      }
   
}
