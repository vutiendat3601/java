package fundamental;

import java.io.Console;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        // ## Run file with command: $ java InputOutput.java < input.txt > output.txt,
        // to load input from file and write output to a file
        Scanner in = new Scanner(System.in);
        Console console = System.console(); // Input must be from console

        System.out.println("What is your name? ");
        String name = in.nextLine();
        System.out.println("Name: " + name);

        System.out.println("What is your age? ");
        int age = in.nextInt();
        in.nextLine();
        System.out.println("Age: " + age);

        System.out.println("What is your address? ");
        String address = in.nextLine();
        System.out.println("Address: " + address);

        System.out.println("What is your phone number? ");
        char[] phone = console == null ? in.nextLine().toCharArray() : console.readPassword();
        System.out.println("Phone: " + new String(phone));

        in.close();
    }
}
