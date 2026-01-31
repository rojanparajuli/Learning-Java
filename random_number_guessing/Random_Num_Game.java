import java.util.Random;
import java.util.Scanner;

class RandomNumberGame{
        static void numberGenerator(){
           
          Random random = new Random();
            Scanner scanner = new Scanner(System.in);
            int number;
             int randomNumber;
        do{
             randomNumber = random.nextInt(100);
            System.out.println("Enter the guessed number:");
            number = scanner.nextInt();
            if(number >100){
                System.out.println("Invalid choice "+number);
            }else if(number == randomNumber){
              System.out.println("Congratulations You are winner!" +randomNumber);
            }else{
                System.out.println("Not correct number! correct choice is " +randomNumber);

            }}while(number != randomNumber);
            scanner.close();
        }

        public static void main (String []args){
             System.out.println("Guess the number between 0 and 99");
            numberGenerator();
        }
}