package fundamental;

public class Operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.printf("%d + %d = %d\n", a, b, a + b);
        System.out.printf("%d - %d = %d\n", a, b, a - b);
        System.out.printf("%d * %d = %d\n", a, b, a * b);
        System.out.printf("%d / %d = %d\n", a, b, a / b);
        // float division = a / b; // Wrong. Because the division of integer by integer
        // always return an integer

        // float division = (float) (a / b); // Wrong. The casting not belong to (a / b)
        // float division = (a * 1F / b); // OK. Implicit casting
        float division = (float) a / b; // The casting is belong to a / b
        System.out.printf("%d / %d = %.2f\n", a, b, division);

        int i = 0;
        System.out.println(++i); // 1 => Execute the expression first
        System.out.println(i++); // 1 => Execute the expression later
        System.out.println(i); // 2

        String phone = "+84123456789";
        if (phone != null && phone.startsWith("+84")) {
            System.out.println("Your phone number is belong to Vietnam");
        }

        String fullName = null;
        if (fullName == null || !fullName.startsWith("Vu")) {
            System.out.println("Your last name is not Vu.");
        }

    }
}
