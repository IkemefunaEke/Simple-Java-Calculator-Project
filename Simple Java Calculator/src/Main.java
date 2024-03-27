import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();
        input.nextLine();

        System.out.print("What operator do you want to use: ");
        String operator = input.nextLine();

        switch (operator){
            case "+":
                System.out.printf("%f + %f = %f", num1, num2, (num1 + num2));
                break;
            case "-":
                System.out.printf("%f - %f = %f", num1, num2, (num1 - num2));
                break;
            case "/":
                if (num2 == 0){
                    System.out.println("You cannot divide by 0");
                    break;
                }
                System.out.printf("%f / %f = %f", num1, num2, (num1 / num2));
                break;
            case "*":
                System.out.printf("%f * %f = %f", num1, num2, (num1 * num2));
                break;
            default:
                System.out.println("That operator does not exist");
                break;
        }


        input.close();
    }
}
