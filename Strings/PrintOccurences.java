package Strings;

public class PrintOccurences 
{
    public static void numberOfCharOccurences(String str)
    {
        //create an array of size 256
        int[] count = new int[256];
        int len = str.length(); 
        // initialise the counter  
        for(int i=0;i<len;i++)
            count[str.charAt(i)]++;

            //create a new char array of length of the string

            char[] ch = new char[str.length()];
            for(int i=0; i<len;i++)
            {
                ch[i] = str.charAt(i);
                int find =0; 

                for(int j=0;j<=i;j++)
                {
                    if(str.charAt(i)== ch[j])
                        find++;

                }

                if(find ==1)
                {
                    System.out.println("number of occurences " + str.charAt(i) + " is :" + count[str.charAt(i)]);
                }

            }
        }

    
        
    public static void main(String[] args) 
    {
        String str = "ramakrishna";
        int n = str.length();
        System.out.println("the number of occurences are : ");
        numberOfCharOccurences(str);
    }
}
