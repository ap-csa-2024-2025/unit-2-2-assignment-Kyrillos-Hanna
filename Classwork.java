import java.util.Scanner;
public class Classwork
{
  public static void main(String[] args)
  {
    Scanner newScanner = new Scanner(System.in);

    System.out.println("What type of itme will you be buying");
    String item = newScanner.nextLine();

    System.out.println("How many are you buying?");
    int amount = newScanner.nextInt();

    System.out.println("How much does each one weigh?");
    double weight = newScanner.nextDouble();

    System.out.println(amount + " " + item + " at " + weight + " pounds each will weigh " + weight * amount + " pounds total\n");

    System.out.print("\"That brain of mine is something more merely mortal; as\ntime will show.\"\nAda Lovelace\nThe first computer programmer");
    System.out.println("\n");
    
    String RED = "\u001B[31m";
    String RESET = "\u001B[0m";
    
    System.out.print(RED + "(" + RESET + "\\" + RED + "(" + RESET + "\\" + "\n" + "( - -)\n" + RED + "(" + RESET + "(') (')");
    
  }
}