package Test1;


import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Math3 {
	@Parameters({"url"})
	@Test
	public void m5(String url) throws Exception
	{
		System.out.println("m5");
		System.out.println(url);
		Thread.sleep(500);
	}
	
	@Test(dataProvider ="getData")
	public void m6(String user, String password)
	{
		System.out.println("m6");
		System.out.println(user+"  "+password);
	}
	@DataProvider
	public Object[][] getData()
	{
		
		HashMap<String,String> map1=new HashMap<String,String>();
		map1.put("email", "abcannu@gmail.com");
		map1.put("password", "annu@1234");
		
		HashMap<String,String> map2=new HashMap<String,String>();
		map2.put("email", "abcannu@gmail.com");
		map2.put("password", "annu@1234");

//		Object[][] obj=new Object[2][2];
//		
//		obj[0][0]="Firstuser";
//		obj[0][1]="pass1";
//
//		obj[1][0]="Seconduser";
//		obj[1][1]="pass2";
		
		return Object[][] {{map1},{map2}};
	}
}
