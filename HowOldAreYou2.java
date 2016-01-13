import java.util.Scanner;


public class HowOldAreYouTwo
{
  public static main void(String[]args0
  {
    Scanner keyboard= new Scanner(System.in);
    
    String name result;
    int age;
    
    
    System.out.print("What's your name again?");
    name=keyboard.next();
    
    System.out.print("Oh yeah, "+name+" How old are you?");
    age=keyboard.nextint();
    
    if (age >16)
    {
      result ="You can't drive.";
    }
    
    else if (age>17)
    {
      result="You can drive but not vote.";
    }
    
    
    
    System.out.prinln(+result+", "+name+);
   }
}
    
    
  
  