package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class JavaBigInteger {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		BigInteger num1 = new BigInteger(s1);
		
		String s2 = br.readLine();
		BigInteger num2 = new BigInteger(s2);
		
		System.out.println(num1.add(num2));
		System.out.println(num1.multiply(num2));
		
		
		
		
	}

}
