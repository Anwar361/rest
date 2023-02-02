package Programing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Program3 {
	
	public static void great()
	{
		int a=200, b=400, c=300;
		int larg=a>b?a:b;
		int largest=larg>c?larg:c;
		System.out.println(largest);		
	}
	public static void sum()
	{
		int a[]= {1,2,3,4,5,6};
		int sum=0;
		for(int i=0; i<a.length; i++)
			sum+=a[i];
		System.out.println(sum);
	}
	public static void compair()
	{
		int a[]= {1,2,3,4,5};
		int b[]= {1,2,3,4,3};
		boolean flag=true;
//		boolean flag=Arrays.equals(a, b);
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=b[i])
				flag=false;
		}
			if(flag==true)
				System.out.println("equal");
			else
				System.out.println("not equals");
	}
	public static void missing()
	{
		int a[]= {1,2,3,4,5,7};
		int sum1=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					sum1=a[i];
					a[i]=a[j];
					a[j]=sum1;
				}
				
			}
			System.out.print(" "+a[i]);
		}
	}
	public static void duplicate()
	{
		int a[]= {1,2,3,4,5,7,3,4};
		ArrayList<Integer> as=new ArrayList<Integer>();
		int k;
		for(int i=0;i<a.length;i++)
		{
			k=0;
			if(!as.contains(a[i]))
			{
				as.add(a[i]);
				k++;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
						k++;
				}
			}
			System.out.print("+"+a[i]+" "+k);
		}
	}
	public static void array()
	{
		Integer a[]= {3,6,8,9,2,4,7,6,8,0};
		String str="an@$#war^& Hussain";
		String s =str.replaceAll("[^a-zA-Z]", "");
		String s1=str.replaceAll("\\s", "");
		System.out.println(s+" "+s1);
		Arrays.toString(a);
		Arrays.parallelSort(a);
		System.out.println(Arrays.toString(a));
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println(Arrays.toString(a));
	}
	public static void stringCount()
	{
		String str="This is A java class";
		String str1=str.replaceAll("([A-Z])", "");
		System.out.println(str1);
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		char[]a=str.toCharArray();
		for(char ch:a)
		{
			if(map.containsKey(ch))
				map.put(ch, map.get(ch)+1);
			else
				map.put(ch, 1);
		}
		System.out.println(map);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		great();
		sum();
		compair();
		missing();
		duplicate();
		array();
		stringCount();
	}

}
