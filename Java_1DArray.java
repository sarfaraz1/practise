package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java_1DArray {
	public static void main(String args[]) throws NumberFormatException, IOException {
		int count=0,sum=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int a[] = new int[n];
		String s[] =  br.readLine().split(" ");
		for(int i=0;i<n;i++)
			a[i] =Integer.parseInt(s[i]);
		
		for(int i=0;i<n;i++) {
			sum=0;
			for(int j=i;j<n;j++) {
				sum = sum+a[j];
						if(sum<0)
							count++;
							
				
			}
				
		}
		System.out.println(count);
			
	}
	

}
