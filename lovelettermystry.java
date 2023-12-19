/*import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;*/
import java.util.Scanner;
public class lovelettermystry {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test=sc.nextInt();
        for(int i=0;i<test;i++){
            String str=sc.next();
            int count=0;
            int lastindex=str.length()/2;
            for(int j=0;j<lastindex;j++){
                int a1=(char)str.charAt(j);
                int a2=(char)str.charAt(str.length()-1-j);
                if(a2>a1){
                   count=count+(a2-a1);
                }
                else{
                    count=count+(a1-a2);
                }
            }
            System.out.println(count);
        }
    }

    
}
