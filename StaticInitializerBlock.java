package practice;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StaticInitializerBlock {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int b =Integer.parseInt( br.readLine());
		int h =Integer.parseInt( br.readLine());
		if(b<=0 || h<=0)
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		
		else
			System.out.println(b*h);

		
	}
	
}