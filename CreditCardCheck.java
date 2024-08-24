
public class CreditCardCheck 
{

    public static boolean onlyDigit(String str)
    {
        for(int i =0; i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(!Character.isDigit(ch))
            {
                return false;
            }
            
        }
        return true;
    }

    public static boolean validCreditCard(String str)
    {
         str = str.replaceAll("-","");
        if(str.length()<13 || str.length()>=18)
        {
            return false;
        }
        if(!onlyDigit(str))
        {
            return false;
        }

        int sum =0;
        boolean flag = false;
        for(int i =str.length()-1;i>=0;i--)
        {
            int digit = Character.getNumericValue(str.charAt(i));

            if(flag)
            {
                digit *= 2;
                if(digit>9)
                {
                    digit -=9;
                }
            }
            sum += digit;
            flag = !flag;
        }
        return(sum%10==0);

    }
    public static void main(String[] args)
    {
        String[] creditcard = {
            "4522-4422-3321-5555",
            "4522-4422-3321-1288"
        };

        for(String number : creditcard)
        {
            System.out.println("credit cardnumber :" +number +" "+validCreditCard(number));
        }
       
    }
}
