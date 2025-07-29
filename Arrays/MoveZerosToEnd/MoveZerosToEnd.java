package Arrays.MoveZerosToEnd;

import java.util.*;

public class MoveZerosToEnd 
{
    public static void moveZerosToEnd(int[] arr, int n)
    { 
        ArrayList<Integer> al = new ArrayList<Integer>();

        for(int i = 0; i<arr.length;i++)
        {
            if(arr[i]!= 0)
            {
                al.add(arr[i]);
            }
        }

        System.out.println(al);
    }
}
