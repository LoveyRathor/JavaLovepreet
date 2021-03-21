//Name: Lovepreet Singh
//Student ID: 201906247
//Date Submitted: 20/02/2021
// Class IN2203  G1
// Name of work: Assignment 1: The Gambling Game

import java.util.Random;
import java.util.Scanner;

public class App {

     public static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) throws Exception {
        // staring the game here
	 System.out.println("    ");
        System.out.println("  \t \t ****Casino World****");
	System.out.println("    ");
        System.out.println(" \t | Number will roll For 5 Times | \n \t | Player with higher wins WINS |");
        System.out.println(" \t Do you want to play a game ??? \n");
        System.out.println("\t press 1 for Yes or any other number To exit. ");
        int answer = 0;
        answer = scan.nextInt();
        if ( answer == 1 ){
            System.out.println("Can i know Your First Name Please ?");
            String userName = scan.next();
            System.out.println("Can i know your Last Name Please ?");
            String userLastName = scan.next();
            System.out.println("Also if You dont mind Your Age please ?");
            int userAge =  scan.nextInt();

//            startGame(userLastName, userName, userAge); // calling a function
            System.out.println(" \t Alright !  \n \t Welcome " + userName + " :) ");
            do {
                startGame(userLastName, userName, userAge);
                System.out.println("\n Do you want to play again ? press 1 for yes. any other number for NO");
                answer = scan.nextInt();

            }while (answer == 1);

            if (answer != 1){
                System.out.println("As You Wish, Bye Have a great day ahead.");
            }

        }else { // user enter any other number than  1
            System.out.println("As You Wish, Bye Have a great day ahead.");

        }

    }


    private static void startGame(String Name,String firstName, int Age ) {



        // count of user and computer wins
        int userWinCount = 0;
        int compWinCount = 0;
        int turns = 1;
        while(turns <= 5) { // while the turns are less than 5 or equal to 5

            // generating  the random numbers
            Random rand = new Random();
            int randomNumber = rand.nextInt(100);


            // user enter their Number
            System.out.println("\n Choose Number from 1 to 100 ...");
            int userNumber = scan.nextInt();
            int newNumber = 0;
            // generating positive difference
            if (userNumber > randomNumber){
                newNumber = userNumber - randomNumber;
            }else{
                newNumber = randomNumber - userNumber;
            }
            // new number should be less than the sum of userAge + 15
            if (newNumber < Age+10)
            {
		System.out.println("random Number : " + randomNumber ); 
		
                System.out.println("\n You are the winner ");
                userWinCount += 1;

            } else {
                System.out.println("\n ******* you were Close *******");
                System.out.println("Computer Win this game......");
               // System.out.println("random Number : " + randomNumber );

                compWinCount += 1;

            }
            turns++;
        }

        System.out.println("\n **********************************************************");

        if(compWinCount > userWinCount){
            System.out.println("Computer Wins !");
        }
        else {
            System.out.println("Drum Shots coming in ! ");
            System.out.println("voohooo !!!!!! " +firstName + " " + Name + ", You are the winner !");
        }


    }
}
