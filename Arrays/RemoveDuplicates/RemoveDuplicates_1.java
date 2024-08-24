package Arrays.RemoveDuplicates;
import java.util.*;
public class RemoveDuplicates_1 
{
    public static void removeDupliates(int[] arr, int n)
    {
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0; i<n;i++)
        {
            set.add(arr[i]);
        }
        System.out.println(set);

        
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,3,2,4,2,3,3,4};
        int n = arr.length;
        removeDupliates(arr, n);
    }
}
