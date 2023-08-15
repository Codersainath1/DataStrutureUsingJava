package SortingAndSearching;

import java.util.Scanner;

public class MargeSort {
	
	public static void marge(int[] a,int[] b, int[] c)
	{
		if(a.length==0&&b.length==0)
		{
			return;
		}
		  int i=0;
		  int j=0;
		  int k=0;
		while(i<a.length&&j<b.length)
		{
			if(a[i]>b[j])
			{
				c[k]=b[j];
				k++;
				j++;
			}else {
				c[k]=a[i];
				i++;
				k++;
			}
		}
		
		if(i<a.length)
		{
			while(i<a.length)
			{
				c[k]=a[i];
				k++;
				i++;
			}
		}
		if(j<b.length)
		{
			while(j<b.length)
			{
				c[k]=b[j];
				k++;
				j++;
			}
		}
		
	}
	
	public static void margeSort(int[] input, int n) {
		
		if(input.length<=1)
		{
			return;
		}
		int a[]=new int[n/2];
		int b[]=new int[n-a.length];
		for(int i=0;i<a.length;i++)
		{
			a[i]=input[i]; 
		}
		int m=a.length;
		for(int i=0;i<b.length;i++)
		{
			b[i]=input[m]; 
			m++;
		}
		margeSort(a, a.length);
		margeSort(b, b.length);
		marge(a, b, input);
		
		
	}
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int input[]=new int[n];
		
		for(int i=0;i<n;i++)
			input[i]=sc.nextInt();
		
		margeSort(input, n);
		
		for(int i:input)
		{
			System.out.println(i);
		}
		
	}

}
