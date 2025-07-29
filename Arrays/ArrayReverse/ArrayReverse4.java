package Arrays.ArrayReverse;
import java.util.*;
public class ArrayReverse4 
{
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5};
        System.out.println("the array before modification :" + Arrays.toString(arr));
        Collections.reverse(Arrays.asList(arr));
        System.out.println("the array after modification :" + Arrays.toString(arr));

    }
    
}
