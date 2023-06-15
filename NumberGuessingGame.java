import java.util.*;


public class NumberGuessingGame {

    public static void main(String ar[]) {
        Random numberGen = new Random();
        int Correctguess = numberGen.nextInt(50); 
        int Numtried=0;
        int NumGuessed;
        int max_attempts=20;   // this is for how many times a user can guess a number.
        Scanner sc=new Scanner(System.in);
        // For knowing that what is the name of the user who want to guess a numer
        System.out.println("Enter the user name : ");
         String user = sc.nextLine(); 
  
         // validation for user to input their name before starting the game. 
         while (user.length() == 0) { 
             System.out.println("Please enter the name:"); 
             user = sc.nextLine(); 
         }; 
  
         System.out.println("Hello " + user + "! Welcome to the number guessing game."+
         " Please remember while playiny the game that you have only 20 attempts for guessing correct number"); 
         //welcome message for user
  
         for (int i = 1; i <= max_attempts; i++) { 
             System.out.println("Guess a number between 0 and 100:"); 
             NumGuessed = sc.nextInt(); 
             Numtried++; 
 // Check if the input the user put is the correct value or not 
  
             if (NumGuessed == Correctguess) { 
                 System.out.println( 
                         "Congratulations " + user + "! You have successfully guessed the correct number in " + Numtried + " attempt(s)"); 
                 break;
             } else if ( NumGuessed < Correctguess) { 
                 System.out.println("Your guess is low"); 
             } else { 
                 System.out.println("Your guess is high"); 
             } 
              
  
             // Check if the user has used all the attempts 
             if (i == max_attempts) { 
                 System.out.println("Sorry, " + user + ", you didn't guess the number in " + max_attempts 
                         + " attempts. The correct number was " + Correctguess); 
             } 
         } 
          
         System.out.println("Thank you for playing"); 
  
         sc.close(); 
     } 
  
 }

