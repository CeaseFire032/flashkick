import java.util.Scanner;


public class HowOldAreYouTwo
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    
    String name;
    int age;
    
    
    System.out.print("What's your name again?");
    name=keyboard.next();
    
    System.out.print("Oh yeah, "+name+" How old are you?");
    age=keyboard.nextInt();
    
    String response = "";
    
    if (age < 16)
    {
      response ="You can't drive";
    }
    
    else if (age < 17)
    {
      response="You can drive but not vote";
    }
    
    else if(age < 24)
    {
      response="You can vote but not rent a car";
    }
    
    else
    {
      response="You can do pretty much anything";
    }
    
    
    System.out.println(""+response+", "+name+"");
   }
}
    
    
  
  