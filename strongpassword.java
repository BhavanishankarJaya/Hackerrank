/*import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;*/
import java.util.Scanner;
public class strongpassword{
     public static void main(String[] args){
         Scanner sc= new Scanner(System.in);
         int length=sc.nextInt();
         String password=sc.next();
         int count=0;
         int num=0;
         int lowercase=0;
         int uppercase=0;
         int specialchar=0;
         
         for(int i=0;i<password.length();i++){
             int ascii=(char)password.charAt(i);
             if(ascii>=48 && ascii<=57){
                 num++;
             }
             else if(ascii>=65 && ascii<=90){
                 uppercase++;
             }
             else if(ascii>=97 && ascii<=122){
                 lowercase++;
             }
             else {
                 specialchar++;
             }
             
         }
         if(num==0){
             count++;
         }
         if(lowercase==0){
             count++;
         }
         if(uppercase==0){
             count++;
         }
         if(specialchar==0){
             count++;
         }
         if(password.length()+count>=6){
             System.out.println(count);
         }
         else{
             System.out.println(count+(6-(password.length()+count)));
         }
     }
    
}
