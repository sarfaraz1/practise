package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 class PrimeDemo {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0) {
			String[] s = br.readLine().split(" ");
			int m =  Integer.parseInt(s[0]);
			int n =  Integer.parseInt(s[1]);
			for (int i = m; i <=n; i++) {
			boolean b =	isPrime(i);
			if(b==true)
				System.out.println(i);
				
			}
			
		}
	}
	
	static boolean isPrime(int i) {
	
		if(i==1)
			return false;
		if(i==2||i==3)
			return true;
		for(int j=2;j<=Math.sqrt(i);j++) {
			if(i%j==0)
				return false;
		}
		return true;
		
		
		
		
		
		
	}

}
