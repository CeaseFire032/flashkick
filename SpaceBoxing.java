import java.util.Scanner;

public class SpaceBoxing
{
  public static void main(String[] args)
  {
  
    int weight,planet;
    Double multiplier=0.0,planetw;
    String planetname="";
    Scanner keyboard = new Scanner(System.in);
    
    System.out.print("Please enter your current earth weight:");
    weight=keyboard.nextInt();
    
    System.out.println();
    System.out.println("I have information for the following planets:");
    System.out.println("  1. Venus    2. Mars    3. Jupiter");
    System.out.println("  4. Saturn   3. Uranus  6. Neptune");
    System.out.println();
    System.out.println("Which planet are you visiting?");
    planet=keyboard.nextInt();
    
    if(planet == 1)
    {
      multiplier=.78;
      planetname="Venus";
    }
    
    else if(planet == 2)
    {
      multiplier=.39;
      planetname="Mars";
    }
    
    else if(planet == 3)
    {
      multiplier=2.65;
      planetname="Jupiter";
    }
    
    else if(planet == 4)
    {
      multiplier=1.17;
      planetname="Saturn";
    }
    
    else if(planet == 5)
    {
      multiplier=1.05;
      planetname="Uranus";
    }
    
    else if(planet == 6)
    {
      multiplier=1.23;
      planetname="Neptune";
    }
    
    else
    {
      System.out.println("Planet number is invalid");
    }
    
    planetw=weight*multiplier;
    
    System.out.println();
    System.out.println("Your weight would be "+planetw+" pounds on "+planetname+".");
    
    
    
  }
}