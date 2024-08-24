package Strings;

import java.util.*;

public class PrintVowels
{
    public static void main(String[] args) {
        String str = "aaeeeiiiooeeeaaauuuuuuuAAAAIIIOOOOOOEEEEEEEUUUUUU";
        String lowercase = str.toLowerCase();
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i =0; i<lowercase.length();i++)
        {
            if(hm.containsKey(lowercase.charAt(i)))
            {
                hm.put(lowercase.charAt(i), hm.get(lowercase.charAt(i))+1);
            }
            else
            {
                hm.put(lowercase.charAt(i), 1);
            }
        }
        
        for(Map.Entry<Character, Integer> set : hm.entrySet())
        {
            if(set.getKey() == 'a'|| set.getKey() == 'e'|| set.getKey() == 'i'||set.getKey() == 'o'||set.getKey() == 'u')
            {
                System.out.println("the repeated vowel is : "+set.getKey() + " "+" number of times repeated is: "+set.getValue());
            }
        }
        
        
    }

}
