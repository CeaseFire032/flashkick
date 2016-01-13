import java.util.Scanner;

public class NameAgeAndSalary
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    
    String name;
    int age;
    double income;
    
    System.out.print("What is your name?");
    name=keyboard.next();
    System.out.println(""+name+"");
  
    
    System.out.print("Hi "+name+". How old are you?");
    age=keyboard.nextInt();
    System.out.println(""+age+"");
    
    System.out.print("So you're "+age+", eh? That's not bad at all!");
    System.out.print("How much do you make, "+name+"?");
    income=keyboard.nextDouble();
    System.out.println(""+income+"! I hope that's per hour and not yearly! LOL!");
    }
}