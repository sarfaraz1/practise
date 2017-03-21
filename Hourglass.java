package practice;

import java.util.Scanner;

public class Hourglass {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int max=-100000;
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        for(int i=0;i<=3;i++) {
        	for(int j=0;j<=3;j++) {
        	int value = sum(arr,i,j);
        	max =(value>max)?value:max;
        	}
        	
        }
        System.out.println(max);
    }

	private static int sum(int arr[][], int i, int j) {
		int value = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
		
		return value ;
		
		
	}

}
