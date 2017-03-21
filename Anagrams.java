package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
	 static boolean isAnagram(String A, String B) {
		 A = A.toLowerCase();
		 char[] charsA = A.toCharArray();
		    Arrays.sort(charsA);
	        String sortedA = new String(charsA); //string A sorted
	        
	        B = B.toLowerCase();
	        char[] charsB = B.toCharArray();
		    Arrays.sort(charsB);
	        String sortedB = new String(charsB);
	        
	        if(sortedA.equals(sortedB))
	        	return true;
	        
	        else
	        	return false;
	   
	   }
	    public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();
	        boolean ret=isAnagram(A,B);
	        if(ret)System.out.println("Anagrams");
	        else System.out.println("Not Anagrams");
	        
	    }
	
	

}
