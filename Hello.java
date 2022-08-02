
public class Hello {
  public static void main(String[] args) {

    // This stuff is nott too bad so far
    // I am excited to learn!

    System.out.println("Hello Joe");
    System.out.print("Oh hello...");
    System.out.println("What are you doing here?");
    System.out.print("Not much...");
    System.out.println("Just learnin about Java...");

    //PRIMITIVE DATA TYPES---------------------------------------

    // the double data type can hold decimals
    // and numbers outside the range of the int type
    double androidShare = 81.7;
    System.out.println(androidShare);

    // int can only hold whole numbers between -2,147,483,648 and 2,147,483,647
    // inclusive
    int numFingers = 2;
    System.out.println(numFingers);

    boolean intsCanHoldDecimals = false;
    System.out.println(intsCanHoldDecimals);

    //char can be any character but it must be in single quotes
    char expectedGrade = 'A';
    System.out.println(expectedGrade);

    //OBJECT DATA TYPES--------------------------------------------------------

    //Creating a String literal:
    String openingLyrics = "Yesterday, all my troubles seemed so far away";

    System.out.print(openingLyrics);

    //Calling the String class to create a new string object:
    String newLyrics = new String(" Now it looks as though they're here to stay");

    System.out.println(newLyrics);

  }
}