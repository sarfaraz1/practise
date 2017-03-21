package practice;

import java.io.*;
import java.util.*;

public class StringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int len=A.length();
        int count=0;
        for(int i=0,j=len-1;i<len/2;i++,j--) {
        	if(A.charAt(i)==A.charAt(j))
        		count++;
        	
        }
          if(count==len/2)
        	  System.out.println("Yes");
          
          else
        	  System.out.println("No");
        
    }
}
