import java.util.Scanner;

public class TwentyQuestions
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    
    String bigger="";
    String answer = "";
    String type="";
    
    System.out.print("TWO QUESTIONS!");
    System.out.print("Think of an object and I'll try to guess it.");
    System.out.println();
    System.out.println("Question 1) Is it animal, vegetable or mineral?");
    type = keyboard.next();
    System.out.println(type);
    
    System.out.print("Question 2) Is it bigger than a breadbox? yes or no?");
    bigger = keyboard.next();
    System.out.println(bigger);
    
    if(bigger == "yes")
    {
      if(type == "vegetable")
      {
	answer="Watermelon";
      }
      else if(type =="animal")
      {
	answer="Moose";
      }
      else
      {
	answer="Camaro";
      }
     } 
     else
     {
      if(type == "vegetable")
	{ 
	  answer="Carrot";
	}
	else if(type == "animal")
	{
	  answer="Squirrel";
	}
	else
	{
	  answer="paper clip";
	}
      }
      
      System.out.println("My guess is that you are thinking of a "+answer+".");
      System.out.println("I would ask you if I'm right, but I don't actually care.");
     }
}
      
    
    