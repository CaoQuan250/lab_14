package Regular.Part1.Ex2;

import java.util.regex.Pattern;

public class Split {
    public static void main(String[] args) {
        String[] x =
                Pattern.compile("is").split(
                        "the darwinian devonian explodian chicken");
        for (int i =0; i<x.length; i++){
            System.out.println(i + " \"" + x[i] + "\"");
        }
    }
}
