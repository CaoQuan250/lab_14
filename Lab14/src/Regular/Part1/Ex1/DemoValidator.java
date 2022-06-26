package Regular.Part1.Ex1;

public class DemoValidator {
    public static void main(String [] args) {
        Validator simpleEmail=new Validator("\\w+@\\w+(\\.\\w+)+");
        System.out.println(simpleEmail.validate("abc@cde.com"));
        System.out.println(simpleEmail.validate("abccde.com"));
    }
}

