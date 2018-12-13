package TestNG_Practice;

import org.testng.annotations.BeforeSuite;

public class AnnotationNG 
{
	@BeforeSuite
	public void BS()
	{
		System.out.println("Before Suite");
	}

}
