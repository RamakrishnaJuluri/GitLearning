import java.util.*;

public class ReverseEachWord 
{
    public static void main(String[] args) {
        String str = "this is epam systems i'm working on";
        String[] str_new = str.split(" ");
        Stack<String> stack = new Stack<String>();
        for(int i=0;i<str_new.length;i++)
        {
            stack.push(str_new[i]);
        }

        while(!stack.empty())
        {
            System.out.println(stack.peek() + " ");
            stack.pop();
        }
        
    }
}
