import java.util.Scanner;

public class ForgetfulMachine
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    
    //String first_word, second_word;
    //int favnum1, favnum2;
    
    System.out.print("Give me a word!");
    System.out.println(keyboard.next());
    //first_word = keyboard.next();
    
    System.out.print("Give me a second word!");
    //second_word = keyboard.next();
    
    System.out.print("Great, now your favoite number?");
    //favnum1 = keyboard.nextInt();
    
    System.out.print("And your second-favorite number...");
    //favnum2=keyboard.nextInt();
    
    System.out.println("Whew! Wasn't that fun?");
    }
}