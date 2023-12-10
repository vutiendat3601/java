package fundamental;

public class Casting {
    public static void main(String[] args) {
        long a = 1_000_000_000_000L;
        int b = (int) a; // Explicit bigger to smaller can be lose data => Avoid

        short c = 10;
        int d = c; // Implicit smaller to bigger => OK

        System.out.println(b); // -727379968 Wrong data
        System.out.println(d);
    }
}
