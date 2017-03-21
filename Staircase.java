package practice;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Staircase {
        static int k=0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
      
       char a[][] = new char[n][n];
      
       for(int i=0;i<n;i++) {
       	for(int j=0;j<n;j++)
       		a[i][j]=' ';		
       }
       
       
        for(int i=0;i<n;i++) {
        	k=i+1;
        	for(int j=n-1;k>0;k--,j--)
        		a[i][j]='#';
        		
        }
        
        for(int i=0;i<n;i++) {
        	for(int j=0;j<n;j++)
        	System.out.print(a[i][j]);
        System.out.println("");		
        }
    }
}
