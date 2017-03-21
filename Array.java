package practice;

import java.util.Scanner;


public class Array 
{
    public static void main(String[] args) 
    {
        int []a=new int[1000000];
        int []b=new int[1000000];
		int []t=new int[1000000];
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int min=0;
        for (int i = 0;i<n ; i++) {
            a[i] = s.nextInt();
			t[i]=a[i];
        }
        for (int i = 0; i < n; i++) 
        {
                b[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) 
        {
            min+=a[i]*b[i];
        }
        int temp=0;
		for(int i=0;i<n;i++)
		{
        for (int l=1;l<=k; l++) 
        {
            a[i]-=2*l;
            for (int j = 0; j < n; j++) 
            {
                temp+=a[j]*b[j];
            }
			if(temp<min)
             min=temp;
			a[i]=t[i];
        }
		}
        temp=0;
		for(int i=0;i<n;i++)
		{
        for (int l=1;l<=k; l++) 
        {
            a[i]+=2*l;
            for (int j = 0; j < n; j++) 
            {
                System.out.print(a[j]*b[j]+" ");
                temp+=a[j]*b[j];
				System.out.print(temp+" ");
            }
            System.out.println(temp+" ");
			if(temp<min)
			{
              min=temp;
			  temp=0;
			}
			a[i]=t[i];
        }
		}
        System.out.println(min);     
    }
}
