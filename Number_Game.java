import java.util.*;

public class Number_Game {
    public static void main(String[] args){
        System.out.println("Welcome to Number Game by CODSOFT!");    //Greeting msg
        Scanner sc = new Scanner(System.in);     //Scanner and Random
        Random rd = new Random();

        boolean playAgain=true;         //for Play Again logic

        while (playAgain) {
            int score = 100;      //Score: set to 100

            int random_num = rd.nextInt(100);  // Random number generated
            int user_num;


        //Making Sure input is only a number
        while(true){
        System.out.println("Guess the number:");

        if(sc.hasNextInt()){
            user_num = sc.nextInt();
            break;
        }else{
            System.out.println("Invalid input! Enter a number:");
            sc.next();
            }
        }


          // Taking the guess by the USER
          while(true){
            if(user_num<random_num){
                System.out.println("Your guess is low,Guess again!");
                user_num=sc.nextInt();
                score--;
            }
            else if(user_num>random_num){
                System.out.println("Your guess is high,Guess again!");
                user_num=sc.nextInt();
                score--;
            }
            else{
                System.out.println("CORRECT GUESS! \n");
                System.out.printf("Your Score is %d",score*10);
                break;
            }       
        }

        // ASK USER TO PLAY AGAIN!

        System.out.println("Press 1 to play again, any other number to quit.");
        int choice = sc.nextInt();
        playAgain = (choice==1);

        }
        
        System.out.println("Thanks for Playing!");        // Thanking msg
        System.out.println("- Created by Krishna Agarwal -");  // Credit to me :)
        sc.close();
    }
}


