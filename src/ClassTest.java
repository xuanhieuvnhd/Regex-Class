public class ClassTest {
    private static Class classExample;
    public static final String [] isClass = new String[] {"C0422H1", "A0220G2", "P0220M3", "M0220G1", "P0220A1"};

    public static void main(String[] args) {
        classExample = new Class();
        for (String classes : isClass) {
            boolean isvalid = classExample.validate(classes);
            System.out.println("Lop la " + classes +" hop le: " + isvalid);

        }
    }
}
