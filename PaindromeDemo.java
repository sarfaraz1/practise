package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PaindromeDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String rev="";
		for (int i =s.length()-1; i >=0; i--) {
			rev=rev+s.charAt(i);
			
		}
		if(s.equals(rev))
			System.out.println("palindrome");
		else
			System.out.println("not a palindrome");	
	}

}
