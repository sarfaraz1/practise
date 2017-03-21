package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class MinProduct {
	static int sum;
	public static void main(String[] args) throws IOException,NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[]= br.readLine().split(" ");
		
		int n = Integer.parseInt(s[0]);
		int k = Integer.parseInt(s[1]);
		int [] a = new int[n];
		
		ArrayList<Integer> b = new ArrayList<>();
		
			String s1[]=br.readLine().split(" ");
		
		
			String s2[]=br.readLine().split(" ");
	
		
		for (int i = 0; i <n; i++) {
			a[i]=Integer.parseInt(s1[i]);
		}
		
		for (int i = 0; i <n; i++) {
			a[i]=Integer.parseInt(s1[i]);
		}
		for (int i = 0; i <n; i++) {
			b.add(Integer.parseInt(s1[i]));
		}
		int index = b.indexOf(Collections.max(b));
		a[index]= a[index]-k*2;
		for (int i = 0; i <n; i++) {
			sum = sum +a[i]*b.get(i);
			
		}
		
		System.out.println(sum);
	}

}
