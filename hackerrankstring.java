import java.util.Scanner;

public class Result {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int testcase=sc.nextInt();
         String str1="hackerrank";
         
         for(int i=0;i<testcase;i++){
             String str=sc.next();
             int j=0;
             int k=0;
             int flag=0;
             while(j<str.length() && k<str.length()){
                 if(str.charAt(j)==str1.charAt(k)){
                     j++;
                     k++;
                 }
                 else if(str.charAt(j)!=str1.charAt(k) && j==str.length()-1){
                     System.out.println("No");
                     flag++;
                     break;
                 }
                 else if(str.charAt(j)!=str1.charAt(k) && j!=str.length()-1){
                     j++;
                 }
                 
             }
             if(k==str1.length()){
                 System.out.println("YES");
             }
             else if(k!=str1.length() && flag==0){
                 System.out.println("NO");
             }
         }
         sc.close();
     }
    
}
