package fundamental;

public class Student {
    public static int count; // Static variable
    public static final String ID_PREFIX = "S"; // Static constant, must be initialized (static block code or inline)
    private final String id; // Instance constant, must be initialized (constructor, block code or inline)
    private boolean isMale; // Instance variable, default is false
    private int provinceCode; // Instance variable, default is 0
    private float dsaMark; // Instance variable, default is 0
    private float javaMark; // Instance variable, default is 0
    private String firstName; // Instance variable, default is null
    private String lastName; // Instance variable, default is null

    static {
        // ID_PREFIX = "S"; // Static constant is initialized in a 'static block code'
    }

    {
        // id = "s"; // Instance constant is initialized in a 'block code'
    }

    // ## Default constructor. If there's no another constructors,
    // ## It's generated automatically
    // public Student() {
    // }

    /* #: Constructors */
    public Student(String id) {
        // ## Explicitly initialize the instance variables
        this.id = id.startsWith(ID_PREFIX) ? id : ID_PREFIX + id;
        this.isMale = false;
        this.provinceCode = -1;
        this.dsaMark = 0;
        this.javaMark = 0;
        this.firstName = "";
        this.lastName = "";
    }

    public Student(String id, String firstName, String lastName) { // constructor
        this(id); // If call another constructor, the call must be at the first line
        this.firstName = firstName;
        this.lastName = lastName;
    }
    /* # Constructors */

    public float calcMarkAvg() {
        final int NUM_OF_SUBJECTS = 2; // Local constant
        float avg; // Local variable
        // System.out.println(avg); // Can’t use a variable if it’s not initialized
        avg = (dsaMark + javaMark) / NUM_OF_SUBJECTS; // Assignment
        return avg;
    }

    /* #: Getters, setters */

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean isMale) {
        this.isMale = isMale;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Student.count = count;
    }

    public static String getIdPrefix() {
        return ID_PREFIX;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getDsaMark() {
        return dsaMark;
    }

    public void setDsaMark(float dsaMark) {
        this.dsaMark = dsaMark;
    }

    public float getJavaMark() {
        return javaMark;
    }

    public void setJavaMark(float javaMark) {
        this.javaMark = javaMark;
    }
    /* # Getters, setters */

    @Override
    public String toString() {
        return "(" + id + ", " + firstName + " " + lastName + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        Student student = (Student) obj;
        return student.id == id && firstName.equals(student.firstName) && lastName.equals(student.lastName);
    }

    @Override
    public int hashCode() { // The same hash code, but can not equals
        return id.hashCode();
    }

    public static void main(String[] args) {
        Student s1 = new Student("1");
        Student s2 = new Student("1");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
