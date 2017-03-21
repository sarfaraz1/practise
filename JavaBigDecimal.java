package practice;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class JavaBigDecimal {

	 public static void main(String []argh)
	    {
	         String temp;
			int res;
	        Scanner sc= new Scanner(System.in);
	        int n=sc.nextInt();
	        String []s=new String[n+2];
	        for(int i=0;i<n;i++)
	        {
	            s[i]=sc.next();
	        }
	        
	        for (int i = 0; i < n; i++) 
	        {
	            for (int j = i + 1; j < n; j++) 
	            {
	            	BigDecimal num1 = new BigDecimal(s[i]);
	            	BigDecimal num2 = new BigDecimal(s[j]);
	            	res = num1.compareTo(num2);
	                if (res==-1) 
	                {
	                    temp = s[i];
	                    s[i] = s[j];
	                    s[j] = temp;
	                }
	            }
	        }
	      
	      
	        //Output
	        for(int i=0;i<n;i++)
	        {
	            System.out.println(s[i]);
	        }

	    }
}
