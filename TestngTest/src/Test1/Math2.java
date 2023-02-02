package Test1;


import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Math2 {
	
	@Test(dependsOnMethods={"m4"})
	public void m3()
	{
		System.out.println("m3");		
		// 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 
		//https://github.com/anwar3617/Annu1.git
			//https://github.com/anwar3617/hello1.git
	}
	
	@Test
	public void m4()
	{
		System.out.println("m4");
//		char g='A';
//		int a=(int) g;
		for(int i =0; i<5; i++)
		{
			char g='A';
			int a=(int) g;
			for(int j =0; j<=i; j++)
			{

				 g=(char) a;
				 System.out.print(g);
					++a;
			}
//			g++;
			System.out.println();
		}
	}
	
	@BeforeTest
	public void pa()
	{
		System.out.println("pa");
		String word="i love coding and testing";
		
		word.chars().mapToObj(e->String.valueOf((char)e)).filter(e->e.equalsIgnoreCase("i"));
		char ch;
		for(int i=0; i<word.length(); i++)
		{
			int cont=0;
		 ch=word.charAt(i);
		for(char c: word.toCharArray())
		{
			if(c==ch)
			{
				cont++;
			}
			
		}
		System.out.println(ch+"..."+cont);
		}
	}
	
	@AfterTest
	public void ae()
	{
		System.out.println("ae");		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no");
		int i=sc.nextInt();
		
		for(int j=1; j<i; j++)
		{
			for(int k=(5-j); k>0; k--)
			{
				System.out.print(" ");
			}
			for(int l=1; l<(j*2); l++)
			{	System.out.print("*");
			}
			
			System.out.println("hi Git");
			
			System.out.println();
			
		}
	}

}
