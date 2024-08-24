package Arrays.ArrayReverse;
import java.util.Stack;

public class ArrayReverse_3 {
 public static void main(String[] args) 
 {
    int[] arr = {1,2,3,4,5};
    Stack<Integer> stack = new Stack<>();
    for(int element : arr) 
    {
        stack.push(element);

    }

    for(int i = 0; i<arr.length; i++)
    {
        arr[i] = stack.pop();
    }

    for( int i : arr)
    {
        System.out.print(i + " ");
    }
 }

}
