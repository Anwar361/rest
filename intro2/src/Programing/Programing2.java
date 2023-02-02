package Programing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Programing2 {
	int num=10;
	
	public static void duplicate()
	{
		String[] s= {"ab","bc","cd","ef","ab","cd"};
		Set<String> str=new HashSet<String>();
		for(String s1:s)
		{
			if(str.add(s1)==false)
				System.out.print(" "+s1);
		}
		System.out.println(str);
	}
	
	public static void numCount()
	{
		int[]a= {2,4,5,7,9,8,5,1,2,3,5,6,7,5,4,7};
		ArrayList<Integer> num=new ArrayList<Integer>();
		int k;
		for(int i=0;i<a.length;i++)
		{	k=0;
			if(!num.contains(a[i]))
			{
				num.add(a[i]);
				k++;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
						k++;
				}
				System.out.print("/"+a[i]+"-"+k);
			}
		}		
	}
	
	public static void charCount()
	{
		String str="this is my first end to end interview";
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		char[]ch=str.toCharArray();
		for(char c:ch)
		{
			if(map.containsKey(c))
				map.put(c, map.get(c)+1);
			else
				map.put(c, 1);
		}
		System.out.println();
		System.out.println(map);
	}
	
	public static int fact(int n)
	{
		if(n==0 || n==1)
			return 1;
		
		return n*fact(n-1);
	}
	
	public static void pyramids()
	{
		for(int i=1;i<5;i++)
		{
			for(int k=5;k>i;k--)
				System.out.print(" ");
			
			for(int j=1;j<i*2;j++)
				System.out.print("*");
			
			System.out.println();
		}
	}
	public static void rev()
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
					rev+=str.charAt(i);
		
		System.out.println(rev);
	}
	
	public static void palindrom()
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int newNum=num, k=0, rev=0;
		
		while(num>0)
		{
			k=num%10;
			num/=10;
			rev=rev*10+k;
		}
		System.out.println(rev);
		if(rev==newNum)
			System.out.println("is palindrom");
		else
			System.out.println("is not palindrom");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		rev();
		pyramids();
		palindrom();
		
		Integer [] a= {3,5,7,8,2,4,6,9};
		Arrays.toString(a);
		Arrays.parallelSort(a);
		System.out.println(Arrays.toString(a));
		Arrays.sort(a, Collections.reverseOrder());
		System.out.println(Arrays.toString(a));
		
//		String str="My Name is Anwar Hussain";
//		String s1=str.replaceAll("([0-9])", "");
//		String s2=str.replaceAll("\\s", "");
//		System.out.println(s1+"  "+s2);
//		
//		duplicate();
//		numCount();
//		charCount();
//		int f=fact(5);
//		System.out.println(f);
	}

}
