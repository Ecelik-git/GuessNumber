import java.util.Scanner;
import java.util.Random;
class Main {
  public static void main(String[] args) {
      Random rand = new Random();
      int upperbound = 100;
      int number = rand.nextInt(upperbound); 
      int tries = 1;
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter your name: ");
    String name = myObj.nextLine();
    System.out.println("Hi "+name+", Please enter a number between 0 and 100\n");
    do {
        System.out.println("Enter your guess: ");
        int guess=myObj.nextInt();
        if (guess==number){
          System.out.println("You won!");
      }else if(guess<number){
          System.out.println("your guess is too low\n");
      }else if(guess > number){
          System.out.println("your guess is too high\n");
      }
      tries++;
    }while (tries<5);
    }
}
