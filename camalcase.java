/*import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;*/
import java.util.Scanner;
public class camalcase{

    public static void main(String[] args){
        int count=1;
        char ch;
        
        Scanner sc= new Scanner(System.in);
        String s=sc.next();
        
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            if(ch>='A' && ch<='Z'){
                count++;
                
            }
            
        }
        sc.close();
        System.out.println(count);
    }
}
