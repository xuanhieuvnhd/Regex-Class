import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Class {
    public static final String CLASS_REGEX ="^[CAP]\\d{4}[GHIKLM]$";
    public static final String CLASS_REGEX1 ="^[CAP]\\d{4}[GHIKLM]\\d{1}$";
    private static Pattern pattern;
    private Matcher matcher;

    public Class() {
        pattern = pattern.compile(CLASS_REGEX1);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
