import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.*;

class Practise extends Thread
{
	Socket stk;
	
	public void Practise(Socket s)
	{
		stk=s;
	}
	
	public void run()
	{
		try
		{
		BufferedReader bf=new BufferedReader(new InputStreamReader(stk.getInputStream()));
		
		//make a PrintStream and convert into Output Stream
		PrintStream ps=new PrintStream(stk.getOutputStream());
		
		String message;
		
		//make a StringBuilder object which helps to reverse a string
		
		StringBuilder sb;
		
		int Clientcount=0;
		
		do
		{
			
			System.out.println("Server ready !!");
		
			message=bf.readLine();
			
			System.out.printf("Client is %d th",Clientcount++);
			
			sb=new StringBuilder(message);
			sb.reverse();
			message=sb.toString();
			
			ps.println(message);
			stk.close();
		}
		while(!message.equals("dne"));
	}
		
		catch(Exception e)
		{
			System.out.println("Exception occured!!");
		}
	}
	public static void main(String []args) throws Exception
	{
		//create a server!!
		ServerSocket sk=new ServerSocket(3000);
		
		Practise p;
		
		do
		{
			Socket stk=sk.accept();
			p=new Practise(stk);
			p.start();
		}while(1);
	
	}
	
	
}


