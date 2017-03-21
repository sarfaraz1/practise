package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java_1DArrayPart2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0) {
			
			String s[] = br.readLine().split(" ");
			int n = Integer.parseInt(s[0]);
			int f = Integer.parseInt(s[1]);
			int a[] = new int[n];
			
				String s1[] = br.readLine().split(" ");
			
			
			for(int j=0;j<n;j++) {
				a[j] =  Integer.parseInt(s1[j]);
			}
			int i=0;
			for(int j=0;j<n;j++) {
				
				if(i>=(n-1))
					System.out.println("YES");
				else {
					if(a[i+1]==0)
						i++;
					
					else {
						if(i+f>=(n-1)) {
							System.out.println("YES");
							break;
						}
						else {
							if(a[i+f]==0)
								i=i+f;
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

}
