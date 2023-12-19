/*import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;*/
import java.util.Scanner;
public class alternatechar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test=sc.nextInt();
        
        for(int i=0;i<test;i++){
            String str=sc.next();
            int count=0;
            for(int j=1;j<str.length();j++){
                if(str.charAt(j)==str.charAt(j-1)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    
}
