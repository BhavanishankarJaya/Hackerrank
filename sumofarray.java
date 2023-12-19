/*import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;*/
import java.util.*;
//import java.util.Arrays;

public class sumofarray {

   public static void main(String[] args){
       int n,sum=0;
       Scanner s= new Scanner(System.in);
       n=s.nextInt();
       
       int[] ar=new int[n];
       
       for(int i=0;i<n;i++){
           ar[i] = s.nextInt();
           sum=sum+ar[i];
       }
       s.close();
       System.out.println(+sum);
   }
}
