import java.util.*;

public class PracticeStrings 
{
    // public static void main(String[] args) 
    // {
    //     String input = "I am Babu, currently attending, interview with, EPAM systems";
    //     String[] s = input.split(",");
    //     Stack<String>stack = new Stack<String>();
    //     for(int i=0;i<s.length;i++)
    //     {
    //         String[] new_word = s[i].split(" ");
    //         for(int j=0;j<new_word.length;j++)
    //         {
    //             stack.push(new_word[j]);
    //         }
    //         while(!stack.empty())
    //         {
    //             stack.peek();
    //             System.out.print(stack.pop()+" ");
    //         }
    //         System.out.print(","+" ");
    //     }

    // }


    public static void main(String[] args) {
        String text="I scream you scream we all scream for ice cream";
         String[] str= text.split(" ");

         HashMap<String,Integer> hm = new HashMap<>();
         for(String word : str)
         if(hm.containsKey(word))
         {
             hm.put(word, hm.get(word)+1);
         }
         else
         {
             hm.put(word,1);
         }
         
         for(Map.Entry<String,Integer> set: hm.entrySet())
         {
             if(set.getValue()>1)
             {
                 System.out.print("the repeated words are :"+ set.getKey());
             }
         }
         
    }

       
}
