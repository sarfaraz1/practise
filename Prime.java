package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Prime {

public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	ArrayList<Integer> al = new ArrayList<>();
	int count=0;
	int n= Integer.parseInt(br.readLine());
	al.add(2);
	for (int i = 3; i <= n; i++) {
	int cond = prime(i);
	if(cond==1)
		al.add(i);
		
		
		
	}
	 int temp=al.get(0)+al.get(1);
	
	for (int i = 2; i <= n; i++) {
		if(temp<=n) {  
		int cond = prime(temp);
		if(cond==1)
			count++;
			
		temp=temp+al.get(i);
		}
		else
			break;
			
			
			
		}
	
	System.out.println(count);
	
}

 static int prime(int i) {
	 int flag=1;
	 for(int j=2;j<=i-1;j++) {
			if(i%j==0)
			{
				flag=0;
				break;
			}
		
				
		}
	 return flag;
	
	
}
}
