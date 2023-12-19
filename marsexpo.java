/*import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;*/
import java.util.Scanner;
public class marsexpo {
     public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         String str=sc.next();
         int length=str.length();
         int count=0;
         for(int i=0;i<length;i=i+3){
             for(int j=0;j<3;j++){
                 if(j%2==0){
                     if(str.charAt(i+j)!='S'){
                         count++;
                     }
                 }
                 else{
                     if((str.charAt(i+j)!='O')){
                      count++;   
                     }
                     
                 }
             }
         }
         System.out.println(count);
     }
   
}
