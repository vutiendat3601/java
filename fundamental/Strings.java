package fundamental;

public class Strings {
    public static void main(String[] args) {

        String firstName = "Dat";
        String lastName = "Vu";

        // ## Do not move to String pool, because all strings is not string literals
        String fullName = firstName + " " + lastName;

        // ## Move to String pool automatically, because all strings is string literal
        // fullName = "Dat " + "Vu";

        // ## false => Avoid compare content of string use `==`
        System.out.println("fullName == \"Dat\" + \" Vu\"" + fullName == "Dat" + " Vu");

        // true => The intern() move content of a String object to the String pool
        System.out.println(fullName.intern() == "Dat" + " Vu");

        // ## true => Use equals to compare content of string
        System.out.println(fullName.equals("Dat" + " Vu"));

        String middleName = new String(" Tien"); // Difference from `" Tien"` (String pool)
        middleName.replace(" ", "$");
        middleName.intern(); // Move string to string pool
        System.out.println(middleName); // ## middleName's content was not changed => String is immutable

        System.out.println(new Student("12345", firstName, lastName));
    }
}
