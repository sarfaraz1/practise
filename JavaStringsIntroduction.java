package practice;

import java.util.Scanner;

public class JavaStringsIntroduction {
	 public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();
	        int length = A.length() + B.length();
	        
	        int compare = A.compareToIgnoreCase(B);
	       
	      String output = A.substring(0, 1).toUpperCase() + A.substring(1) +" "+ B.substring(0, 1).toUpperCase() + B.substring(1);
	     
	      System.out.println(length);
	      
	      if(compare < 0){
        	  System.out.println("No");
        }
        else if(compare > 0 ){
        	  System.out.println("Yes");
        }
        else{
        	System.out.println("No");
        }
	      
	      System.out.println(output);
	       
	        
	        
	    }

}
