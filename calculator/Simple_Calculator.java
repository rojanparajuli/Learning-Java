import java.util.Scanner;

 class SimpleCalculatorParent{

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int oprators;
    do{
        System.out.println("Enter the first number");
        double firstNumber = scanner.nextInt();

        System.out.println("Enter the Second Number");
        double secondNumber = scanner.nextInt();

        System.out.println("ENter 1 for '+', 2 for '-' ,3 for '*', 4 for '/',5 for 'Exit'");

         oprators = scanner.nextInt();

        switch(oprators){
            case 1:
                System.out.println(firstNumber + secondNumber);
                break;
            case 2:
                System.out.println(firstNumber - secondNumber);
                break;
            case 3:
                System.out.println(firstNumber * secondNumber);
                break;
            case 4:
                System.out.println(firstNumber / secondNumber);
                break;
           
            case 5:
                System.out.println("Exiting case 5");
                break;   

            default:
                System.out.println("Something went wrong");                     
        }

    }while (oprators != 5);

    scanner.close();


    }
    }
