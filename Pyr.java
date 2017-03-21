package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pyr {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int z=1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <n-i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print(z+ " ");
				z=z+2;
			}
			System.out.println();
		}
		
		
		
		
		

}
	


}
