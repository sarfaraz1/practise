package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class part2try {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0) {
			int i = 0;
			String s[] = br.readLine().split(" ");
			int n = Integer.parseInt(s[0]);
			int f = Integer.parseInt(s[1]);
			int a[] = new int[n];
			
				String s1[] = br.readLine().split(" ");
			
			
			for(int j=0;j<n;j++) {
				a[j] =  Integer.parseInt(s1[j]);
			}
			
			while(i<n+100) {
				if(i>=(n-1) || i+f>=(n-1)) {
					System.out.println("YES");
					break;
				}
				else {
				if(walk(a,i))
					i=i+1;
				
				else {
					if(jump(a,i,f))
						i=i+f;
					
					else {
						if(backjump(a,i,f)) {
							i--;
							i=i+f;
						}
						
						else {
							System.out.println("NO");
							break;
						}
					}
					
					
				}
				
				}	
			
			}


		}

	}

	
	private static boolean backjump(int[] a, int i,int f) {
		if(i>0) {
		i--;
		if(a[i+f]==0)
			return true;
		}
		return false;
	}


	private static boolean jump(int[] a, int i,int f) {
		if(a[i+f]==0)
			return true;
		
		
		return false;
	}


	private static boolean walk(int a[],int i) {
		if(a[i+1]==0)
			return true;
		
		return false;
	}
	
}