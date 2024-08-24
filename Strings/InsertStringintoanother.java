package Strings;

public class InsertStringintoanother
{
    public static String insertString(String str, int index,  String insertedString)
    {
        String newString = new String();
        for(int i =0; i<str.length();i++)
        {
            newString = newString+str.charAt(i);

            if(i == index)
            {
                newString += insertedString;
            }
        }
        
        return newString;
    } 
     

    public static void main(String[] args) {
        String str = "TimesIndia";
        String newString = InsertStringintoanother.insertString(str, 4, "Of");
        System.out.println(newString);
    }
}
