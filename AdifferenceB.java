package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdifferenceB {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String i[]=  br.readLine().split(" ");
		int a =Integer.parseInt(i[0]);
		int b =Integer.parseInt(i[1]);
		int c = a-b;
		if(c%10==9)
			System.out.println(c-1);
		else
			System.out.println(c+1);
		
		
	}

}
