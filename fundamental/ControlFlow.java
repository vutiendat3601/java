package fundamental;

import java.util.Date;

public class ControlFlow {
    private String message = "Empty message";

    { // Instance block code, call when instantiate
        System.out.println(message);
        message = "Hello, World!";
        System.out.println(message);
    }

    static { // Static block code, call when load the class
        System.out.println("This is static block code");
    }

    public void ifElse() {
        // ## Inside if else statement is always an expression return boolean value
        double num = Math.random();
        if (num < 0.5D) {
            System.out.println("Randomized a number smaller than 0.5");
        } else if (num > 0.9D) {
            System.out.println("Randomized a number bigger 0.9");
        } else {
            System.out.println("Randomized a number in range [ 0.5, 0.9 ]");
        }
    }

    public void loop() {
        long endSec = new Date().getTime() / 1000 + 1; // Waiting 1 second
        while (new Date().getTime() / 1000 < endSec) {
            System.out.println("Playing... ");
        }
        for (int i = 1; i <= 10; i++) {
            System.out.printf("9 x %2d = %2d\n", i, 9 * i);
        }

        int MAX = 10;
        double num;
        do {
            num = Math.ceil(MAX * Math.random());
            System.out.println("Num: " + num);
        } while (num < MAX - 1);

        for (String s : new String[] { "Hello", ",", "world", "!" }) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public void switchCase() {
        int mark = (int) Math.ceil(Math.random() * 10D);
        System.out.println("Mark: " + mark);
        switch (mark) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("C");
                break;
            case 5:
            case 6:
            case 7:
                System.out.println("B");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("A");
                break;
            default:
                System.out.println("Unranked!");
        }
    }

    public static void main(String[] args) {
        { // ## Block code
            System.out.println("This is local block code");
        }
        ControlFlow cf = new ControlFlow();
        cf.ifElse();
        cf.loop();
        cf.switchCase();
    }
}
