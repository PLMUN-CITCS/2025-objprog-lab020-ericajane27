import java.util.Scanner;

public class MenuProgram {
    public static void main(String[] args) {
        while (true) {
            displayMenu(); 
            int choice = getMenuChoice(); 
            if (handleMenuChoice(choice)) {
                break; 
            }
        }
    }
    public static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Greet User");
        System.out.println("2. Check Even or Odd");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
    }
    public static int getMenuChoice() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid menu choice.");
            scanner.next(); 
            System.out.print("Enter your choice: ");
        }
        return scanner.nextInt();
    }
    public static boolean handleMenuChoice(int choice) {
        if (choice == 1) {
            greetUser();
        } else if (choice == 2) {
            checkEvenOrOdd();
        } else if (choice == 3) {
            System.out.println("Exiting the program. Goodbye!");
            return true; 
        } else {
            System.out.println("Invalid choice. Please enter a valid menu option.");
        }
        return false; 
    }
    public static void greetUser() {
        System.out.println("Hello, User! Welcome to the program.");
    }
    public static void checkEvenOrOdd() {
        int number = getIntegerInput(); 
        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }
    }
    public static int getIntegerInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.next(); 
            System.out.print("Enter an integer: ");
        }
        return scanner.nextInt();
    }
}