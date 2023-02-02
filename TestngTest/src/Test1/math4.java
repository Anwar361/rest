package Test1;

import java.io.Console;

import org.testng.annotations.Test;

public class math4 {
	
	@Test
	public void m1()
	{
		char ach,bch;
		ach=88;
		bch='y';
		System.out.println(ach+" "+bch);
	}

	@Test
	public void m2()
	{
		final int i =20;
		System.out.println(" the value change"+i);
	}
	
	@Test
	public void m3()
	{
		int a=30;
		int b=40;
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("a="+a+"b="+b);
	}
	
	@Test
	public void m4()
	{
		
	}
	
	@Test
	public void m5()
	{
				
	}
}
