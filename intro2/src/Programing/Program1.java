package Programing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import dev.failsafe.internal.util.Assert;

//import java.util.Scanner;

public class Program1 {
	
	public void factorial(int num)
	{
		if(num==0 || num==1)
			System.out.println("1");
		for(int i=2; i<num;i++) {
			num=num*i;
		}
		System.out.println(num);
	}
	
	public static void dupStr(){
		String str= "this my first my prog";
		String[] str1=str.split(" ");
		Set<String> s=new HashSet<String>();
		for(String s1:str1)
		{
			if(s.add(s1)==false)
				System.out.println(s1);
		}
	}
	
	public static int recursion(int num)
	{
		if(num==0)
			return 1;
		return (num*recursion(num-1));		
	}
	
	public static void armstrong(int num)
	{
		int ar=num, n=0, cube=0;
		while(num>0)
		{
			n%=10;
			num/=10;
			cube=cube+(n*n*n);
		}
		if(cube==ar)
			System.out.println("is armstrong");
		else
			System.out.println("is not armstrong");
	}
	
	public void palindrom(int num)
	{
		int newNum=num, rev=0, a=0;
		while(num>0)
		{
			a%=10;
			num/=10;
			rev*=10+a;
		}
		if(newNum==rev)
			System.out.println("is palindrom");
		else
			System.out.println("is not palindrom");
	}
	
	public static void primNumber(int num)
	{		int count=0 ;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				count++;
				break;
			}
		}
		if(count>0)
			System.out.println("is palindrom");
		else
			System.out.print("is not palindrom");
	}
	
	public static void stringPalindrom(String str)
	{
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev))
			System.out.println("is palindrom");
		else
			System.out.println("is not palindrom");
	}
	public static void swap(int n, int m)
	{
		int temp;
		temp=n;
		   n=m;
		  m=temp;
		  System.out.println(n+" "+m);
	}
	
	
	public static void java1()
	{
		Random rand=new Random();
		int num=rand.nextInt(10000);
		System.out.println("hello java"+num);
	}
	
	public static void dupNum() {
		int []a= {1,3,5,7,9,2,4,6,8,3,6,4};
		int [] b =new int[a.length];
		int k;
		ArrayList<Integer> a1=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			k=0;
			if(!a1.contains(a[i])) {
				k++;
				a1.add(a[i]);
				for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j])
						k++;
				}
				b[i]=k;
				System.out.println(a[i]+" "+b[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=5;
		
		Program1 pro=new Program1();
		pro.factorial(num);
		
		int fac=recursion(num);
		System.out.println(fac);
		
		armstrong(371);
		
		pro.palindrom(10);
		
		Program1.primNumber(10);
		
		Program1.stringPalindrom("chacha");
		Program1.dupStr();
		Program1.dupNum();
		
		java1();
		
		swap(5,6);
		
	}

}
