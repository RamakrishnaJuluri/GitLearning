public class ValidateCreditCard 
{

    static boolean onlyDigits(String str)
    {
        String card_number = str.replaceAll("-","");
        for(int i =0; i<card_number.length(); i++)
        {
            char ch = card_number.charAt(i);
            if(!Character.isDigit(ch))
            {
                return false;
            }
        }
        return true;
    }
    public static boolean validateCreditCard(String str)
    {
        String card_number = str.replaceAll("-","");
        if(card_number.length()<13 || card_number.length()>=18)
        {
            return false;
        }
        if(!onlyDigits(str))
        {
            return false;
        }

        int sum =0;
        boolean alternate = false;
        for(int i = card_number.length()-1; i>=0;i--)
        {
            int digit = Character.getNumericValue(card_number.charAt(i));

            if(alternate)
            {
                digit *= 2; 
                
                if(digit>9)
                {
                    digit -= 9;   
                }
            }
            sum += digit;
            alternate = !alternate;
        }
        return (sum%10 == 0);
    }

    public static void main(String[] args)
    {
        String[] testNumbers = {
            "4522-4422-3321-555556", 
            "4522-4422-3321-5555",
            "4522-4422-3321-5555-22" ,
            "4522-4422-3321-1288",
            "4522-4422-3321-55ab"   
        };

        for (String number : testNumbers) {
            System.out.println("Card Number: " + number + " - Valid: " + validateCreditCard(number));
        }
    
    }
}
