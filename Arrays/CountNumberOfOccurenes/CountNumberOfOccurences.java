package Arrays.CountNumberOfOccurenes;
import java.util.*;
public class CountNumberOfOccurences 
{
    public static int countNumberOfOccurenecs(int[] arr,int n)
    {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<n; i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i], map.get(arr[i])+1);
            }
            else
            {
                map.put(arr[i], 1);
            }
        }

        int max_count = 0 , res = -1;
        for(Map.Entry<Integer, Integer> set: map.entrySet())
        {
           if(max_count < set.getValue())
           {
              res = set.getKey();
              max_count = set.getValue();
           }
        }
            return res; 
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,3,2,3,4,2,1,3,4};
        int n = arr.length;
        System.out.println(countNumberOfOccurenecs(arr, n));
    }
}
