package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class py {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int n = Integer.parseInt(br.readLine());
	String a[] = new String[200];
	DecimalFormat df = new DecimalFormat("#00000");
	
	for (int i =0 ; i < 105; i++) {
		a[i+1]=df.format(8*i*i+14*i+6);
	
	}
	
	/*pyramid */
    
	int t=0,k=n,flag=1,flag2=0;
	for (int i = 0; i <n; i++) {
		
		for (int j = 0; j <=n; j++) {
			System.out.print(" ");
			if(j==k) {
				for (int l = 0; l < flag; l++) {
					System.out.print(a[++t]);
					System.out.print(" ");
					
				}
				flag2=1;
				
			}
			if(flag2==1)
				break;
		}
		System.out.println();
		k--;
		flag++;
		flag2=0;
	}
	
	
	
	
	
	
	
	
	
	
	


}
}
