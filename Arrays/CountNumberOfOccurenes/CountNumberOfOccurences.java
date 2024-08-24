package Arrays.CountNumberOfOccurenes;
import java.util.*;
public class CountNumberOfOccurences 
{
    public static void countNumberOfOccurenecs(int[] arr,int n)
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
        for(Map.Entry<Integer, Integer> set: map.entrySet())
        {
           System.out.println("the nuber is :"+set.getKey()+" "+"the occurences is: "+set.getValue());
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,3,2,3,4,2,1,3,4};
        int n = arr.length;
        countNumberOfOccurenecs(arr, n);
    }
}
