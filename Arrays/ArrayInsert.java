package Arrays;
import java.util.Arrays;

public class ArrayInsert 
{
    public static void main (String args[])
    {
    int arr[] = {1,2,3,4,5,6,7,8,9};
    int position = 4;
    int value_tobe_inserted = 10;
    int arr1[] = new int[arr.length+1];
    for(int i=0;i<arr.length+1;i++)
    {
        if(i<position-1)
        {
            arr1[i] = arr[i];
        }
        else if(i==position-1)
        {
            arr1[i] = value_tobe_inserted;
        }
        else
        {
            arr1[i] = arr[i-1];
        }
        
    }
    System.out.println(Arrays.toString(arr1));
}

}