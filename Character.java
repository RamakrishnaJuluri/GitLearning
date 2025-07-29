public class Character 
{
    public static void mian(String args[])
    {
        String number = "9987634210";
        char[] ch = number.toCharArray();
        int count = 0; 
        for(char c : ch)
   
        {
            if(c == '9')
            {
            count++;
            }

            System.out.println("the count of 9's =" + count);
    }    }
}
