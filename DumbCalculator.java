import java.util.Scanner;

public class DumbCalculator
{
  public static void main(String[] args)
  {
    Scanner keyboard=new Scanner(System.in);
    
    Double first,second,third,calculation;
    
    System.out.print("What is your first number?");
    first=keyboard.nextDouble();
    System.out.print("What is your second number?");
    second=keyboard.nextDouble();
    System.out.print("What is your third number?");
    third=keyboard.nextDouble();
    calculation=((first+second+third)/2);
    System.out.println("");
    System.out.println("("+first+"+"+second+"+"+third+")/2 is..."+calculation+"");
    }
}