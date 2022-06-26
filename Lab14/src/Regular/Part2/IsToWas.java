package Regular.Part2;

import java.util.regex.Pattern;

public class IsToWas {
    public static void main(String[] args) {
        String txt = "it is what it is";
        String replace=txt.replace("is","was");
        System.out.println(replace);
    }
}
