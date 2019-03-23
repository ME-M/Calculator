import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //Not an essential way of doing it but it's definitely cleaner.

        char operation;
        int number1, number2;

        System.out.println("Enter your first number");

        number1 = scan.nextInt(); //We're just setting our int to what the user enters

        System.out.println("Choose your operation (+, -, %, *)");

        operation = scan.next().charAt(0); //(0) Basically takes the first char// Example: User enters *%-+, it only takes "*" which is the first char

        System.out.println("Enter your second number");

        number2 = scan.nextInt();

        if(operation == '+') {
            System.out.println("Your result is (" + (number1 + number2) + ")");
        } else if (operation == '-') {
            System.out.println("Your result is {" + (number1 - number2) + ")");
        } else if (operation == '%' || operation == '/') {
            System.out.print("Your results is (" + (number1 / number2) + ")");
        } else if (operation == 'x' || operation == '*') {
            System.out.println("Your result is (" + (number1 * number2) + ")");
        }
    }
}
