import java.util.*;
import java.io.*;

@SuppressWarnings("unchecked")
//@SuppressWarnings("rawtypes")

		
class Practise
{
	public static void main(String []args)
	{
    //creating a property datastructure which allows only string as key and values!!.
			Properties p=new Properties();
			
			p.setProperty("game","PS4");
			p.setProperty("model","Sony");
			
			try
			{
				//storing the properties of p to sample.xml file
				
				p.storeToXML(new FileOutputStream("C:\\Users\\91782\\OneDrive\\Desktop\\programs\\sample.xml"),"GAMES");
				
				//reading the properties of p to sample.xml file
				
				p.loadFromXML(new FileInputStream("sample.xml"));
				
				//reading the properties of p to sample.txt file
				p.load(new FileInputStream("sample.txt"));
				
				System.out.println(p);
			}

			catch(Exception e)
			{
				System.out.println("File not found ");
			}
			
			
			
	}
	
}
