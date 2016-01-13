import java.util.Scanner;

public class MoreUserInputOfData
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    
    String fname,lname,login;
    int grade,sid;
    Double gpa;

    System.out.println("Please enter the following information so I can sell it for profit!");
    System.out.print("First name:");
    fname=keyboard.next();
    
    System.out.print("Last name:");
    lname=keyboard.next();

    System.out.print("Grade (9-12):");
    grade=keyboard.nextInt();

    System.out.print("Student ID:");
    sid=keyboard.nextInt();
    
    System.out.print("Username:");
    login=keyboard.next();

    System.out.print("GPA (0.0-4.0):");
    gpa=keyboard.nextDouble();

    System.out.println("Your information:");
    System.out.println("     Login: "+login+"");
    System.out.println("     ID:    "+sid+"");
    System.out.println("     Name:  "+lname+","+fname+"");
    System.out.println("     GPA:   "+gpa+"");
    System.out.println("     Grade: "+grade+"");

}
}