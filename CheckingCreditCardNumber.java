public class CheckingCreditCardNumber 
{
    static boolean containsOnlyDigits(String str)
    {
        for(int i =0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(!Character.isDigit(ch));
            return false;
        }
        return true;
    }

    static boolean validCreditCardNumber(String str)
    {
        str = str.replaceAll("\\D", "");
        if(str.length()!=16)
        {
            return false;
        }
        if(!containsOnlyDigits(str))
        {
            return false;
        }

        int sum = 0;
        boolean flag = false;
        for(int i = str.length()-1; i>=0; i--)
        {
            int d = str.charAt(i)-'0';

            if(flag)
            {
                d = 2*d; 
                if(d>9) 
                {
                    d -= 9;
                }
            }
            sum += d;
            flag = !flag;
        }
        return (sum%10 ==0);
    }

    public static void main(String[] args)
    {
        String[] testNumbers = {
            "4522-4422-3321-5555", 
            "4522-4422-3321-555556", 
            "4522-4422-3321-5555-22" ,
            "4522-4422-3321-1288",
            "4522-4422-3321-55ab "   
        };

        for (String number : testNumbers) {
            System.out.println("Card Number: " + number + " - Valid: " + validCreditCardNumber(number));
        }
    }


    
}
