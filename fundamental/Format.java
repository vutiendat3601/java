package fundamental;

import java.text.NumberFormat;
import java.util.Locale;

public class Format {
    public static void main(String[] args) {
        final int GRADE = 10;
        char tmpSign = 'A';
        int[] numOfStudents = { -32, 22, 32, 32, 21, 32 };

        for (int i = 0; i < numOfStudents.length; i++) {
            System.out.printf("%-3s ", "" + GRADE + tmpSign);
            tmpSign++;
        }
        System.out.println();
        for (int i = 0; i < numOfStudents.length; i++) {
            System.out.print(String.format("%-3d ", numOfStudents[i]));
            tmpSign++;
        }
        System.out.println();

        Locale vnLocale = new Locale("vi", "VN");
        NumberFormat vnCurrencyFormat = NumberFormat.getCurrencyInstance(vnLocale);
        System.out.println(vnCurrencyFormat.format(1_000_000));

        NumberFormat vnNumberFormat = NumberFormat.getNumberInstance(vnLocale);
        System.out.println(vnNumberFormat.format(1_000_000));
    }
}
