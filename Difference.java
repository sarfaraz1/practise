package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Difference {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		Integer c = (a-b);
		String d = c.toString();
		char e = d.charAt(0);
		if(e == '-')
			System.out.println(b+" is greater than "+ a);
		else
			System.out.println(a+" is greater than "+ b);
	}

}
