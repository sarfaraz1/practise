package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Horse {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int a[] = new int[5000];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0) {
			int min=1000000000;
			int n = Integer.parseInt(br.readLine());
			String s[] = br.readLine().split(" ");
			
			for (int i = 0; i < s.length; i++) {
				a[i]= Integer.parseInt(s[i]);
			}
			for (int i = 0; i < s.length; i++) {
				for (int j = i+1; j < s.length; j++) {
					int temp=Math.abs((a[i]-a[j]));
					if(temp<min)
						min=temp;
					
				}
				
			}
			System.out.println(min);
			
				
			
			
		}
	}

}
