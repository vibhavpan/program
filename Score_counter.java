//program to calculate highest score 

using System;

namespace program
{
	class program
	{
		public static int highScore=0;					//at start make highScore=0
		public static string Name="";					//make Name as empty string
		
		//create 	method Calculatescore
		
		public static void calculateScore(int score,string userName)			
		{
			if(score>highScore)							//if new score>old score
			{
				highScore=score;							//update highScore to new score
				Name=userName;							//update Name to userName
				
				Console.WriteLine("Congrats !!!");
				
				Console.WriteLine("New high score "+highScore);		
				Console.WriteLine("Done by "+userName);
			}
			
			else														//if new Score<old score
			{
				Console.WriteLine(userName+" Your score "+score);	     //print user score
				
				Console.WriteLine("High score "+highScore);		  //print top score
				Console.WriteLine("Top scorer is "+Name);			  //print topper Name 
				
	
			}
			
		}
		
		//method for taking name and score from player
		
		public static void Details()
		{
			for(int i=0;i<3;i++)									//for 3 players
		 {
			string name;												//make variable name
			int score;													//make variable score
			string Score;
			
			Console.WriteLine("Enter your name and score ");
			
			name=Console.ReadLine();							//read user Name
			Score=Console.ReadLine();							//take score (Read) as string
			
			score=int.Parse(Score);								//convert to int using Parse
			
			if(int.TryParse(Score,out score))				//converting using TryParse
			{
				
			Console.WriteLine(score);
			}
			
			else
			{
				Console.WriteLine("None");
			}
			
			//pass values to score method.
			calculateScore(score,name);		
		 }
		}
		public static void Main()
		{
			
			Details();
				
		}
	}
}
