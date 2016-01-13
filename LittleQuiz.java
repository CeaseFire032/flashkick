import java.util.Scanner;

public class LittleQuiz
{
  public static void main(String[] args)
  {
    Scanner keyboard=new Scanner(System.in);
    int score=0,ans1,ans2,ans3;
    String ready;
    
    System.out.print("Are you ready for a quiz?");
    ready=keyboard.next();
    
    System.out.println("Okay, here it comes!");
    System.out.println();
    System.out.println("Q1) What is the capital of Alaska?");
    System.out.println("        1) Melbourne");
    System.out.println("        2) Anchorage");
    System.out.println("        3) Juneau");
    ans1=keyboard.nextInt();
    
    if(ans1 == 3)
    {
      System.out.println("That's correct!");
      score=score+1;
    }
    
    else
    {
      System.out.println("Sorry that is incorrect. The capital of Alaska is Juneau.");
    }
    System.out.println();
    
    System.out.println("Q2) Can you store the value 'cat' in a variable of type int?");
    System.out.println("        1) Yes");
    System.out.println("        2) No");
    ans2=keyboard.nextInt();
    
    if(ans2 == 2)
    {
      System.out.println("That's correct!");
      score=score+1;
    }
    
    else
    {
      System.out.println("Sorry,'cat' is a string and cannot be store in an int variable.");
    }
    System.out.println();
    
    System.out.println("Q3) What is the result of 9+6/3?");
    System.out.println("        1) 5");
    System.out.println("        2) 11");
    System.out.println("        3) 15/3");
    ans3=keyboard.nextInt();
    
    if(ans3 == 2)
    {
	System.out.println("Thats correct!");
	score=score+1;
    }
    
    else
    {
      System.out.println("Sorry tha is incorrect.");
    }
    System.out.println();
    
    System.out.println("Overall you got "+score+" out of 3 correct");
    System.out.println("Thanks for playing");
  }
}
    