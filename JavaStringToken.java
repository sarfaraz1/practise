package practice;

import java.util.Scanner;
import java.util.StringTokenizer;

public class JavaStringToken {
	  public static void main(String[] args) {
      
		  
		
        Scanner scan = new Scanner(System.in);
        String s=scan.nextLine();
        
       
        s=s.trim();
        if(s.length()==0) {
        	System.out.println("0");
        }
        else {
        StringBuffer s1 = new StringBuffer(s);
        
        
        for(int i=0;i<s1.length();i++) {
        	long a = (long)(s1.charAt(i));
        	if((a>=65 && a<=90) || (a>=97 && a<=122))
        			continue;
        	else
        		s1.setCharAt(i,' ');
        }
        
        String str = new String(s1);
        
        String[] result = str.split("\\s+");
        System.out.println(result.length);
        for (int x=0; x<result.length; x++)
            System.out.println(result[x]);
        	
        
        }
      
	  }
      }

