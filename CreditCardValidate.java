import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreditCardValidate 
{
    private static final String CREDIT_CARD_REGEX = 
        "^(?:(?<visa>4[0-9]{12}(?:[0-9]{3})?)|" +
        "(?<mastercard>5[1-5][0-9]{14})|" +
        "(?<amex>3[47][0-9]{13}))$";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(CREDIT_CARD_REGEX);
        
        // Test card numbers
        String[] testNumbers = {
            "4522-4422-3321-5555", 
            "4522-4422-3321-555556", 
            "4522-4422-3321-5555-22" ,
            "4522-4422-3321-1288",
            "4522-4422-3321-55ab "

        };
        
        for (String number : testNumbers) {
            Matcher matcher = pattern.matcher(number);
            if (matcher.matches()) {
                if (matcher.group("visa") != null) {
                    System.out.println(number + " is a Visa card.");
                } else if (matcher.group("mastercard") != null) {
                    System.out.println(number + " is a MasterCard.");
                } else if (matcher.group("discover") != null) {
                    System.out.println(number + " is a Discover card.");
                } else if (matcher.group("amex") != null) {
                    System.out.println(number + " is an American Express card.");
                } else if (matcher.group("diners") != null) {
                    System.out.println(number + " is a Diners Club card.");
                } else if (matcher.group("jcb") != null) {
                    System.out.println(number + " is a JCB card.");
                }
            } else {
                System.out.println(number + " is not a valid credit card number.");
            }
        }
    }
    
}
