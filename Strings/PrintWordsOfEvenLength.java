package Strings;

public class PrintWordsOfEvenLength {

    public static String wordsOfEvenLength(String str)
    {
        for(String words : str.split(" "))
        {
            if(words.length()%2 == 0)
            {
                System.out.println(words);
            }
            else
            {
                System.out.println(words + " : word is not even");
            }
            
        }
        return str;
    }

    public static void main(String[] args) {
        String str = "us we are";
        PrintWordsOfEvenLength.wordsOfEvenLength(str);
    }
    
}
