package Utility;
import java.util.ArrayList;

public class Utilities{ 

	static Xls_Reader reader;
	
	 public static ArrayList<Object[]> getdatafromexcel()
	 {
		 ArrayList<Object[]> mydata = new ArrayList<Object[]>();
		 try
		 {
			 reader = new Xls_Reader(System.getProperty("E:/Selenium/TestNG_Practice/src/Data/TestData.xlsx"));
		 } catch (Exception e){
			 e.printStackTrace();
		 }
		 
		 for (int rowNum =2;rowNum <= )
		 
	 }

}
