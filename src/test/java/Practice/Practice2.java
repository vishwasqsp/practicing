package Practice;

import org.testng.annotations.Test;

public class Practice2 
{
	@Test
	public void pr1()
	{
		System.out.println("executed");
		String url = System.getProperty("url");
		System.out.println("BROWSER IS -------> "+url);
	}
}
