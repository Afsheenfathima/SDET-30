package demoGitHub;

import org.testng.annotations.Test;

public class readDataFromTest
{
	@Test
	public void read()
	{
		String BROWSER = System.getProperty("browser");
		System.out.println(BROWSER);
 
		String URL = System.getProperty("url");
		System.out.println(URL);
	}
}
