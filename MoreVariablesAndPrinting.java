public class MoreVariablesAndPrinting
{
  public static void main(String[] args)
  {
   String myName,myEyes,myTeeth,myHair;
   int myAge,myHeight,myWeight;
   
   myName="Curt Dietrick";
   myAge=32;
   myHeight=75; //inches
   myWeight=185; //lbs
   myEyes="Blue";
   myTeeth="White";
   myHair="Brown";
   
   System.out.println("Let's talk about "+myName+" .");
   System.out.println("He's "+(myHeight*2.54)+" cm tall.");
   System.out.println("He weighs "+(myWeight*2.204)+" kilograms.");
   System.out.println("He's got "+myEyes+" eyes and "+myHair+" hair.");
   System.out.println("His teeth are usually "+myTeeth+" depending on how much coffe he drinks.");
   
   System.out.println("If I add "+myAge+","+myHeight+" and "+myWeight+" I get "+(myAge+myHeight+myWeight)+".");
   }
}