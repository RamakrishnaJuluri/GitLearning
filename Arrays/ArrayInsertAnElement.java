package Arrays;
import java.util.Arrays;

public class ArrayInsertAnElement
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6};
        int[] arr1 = new int[arr.length+1];
        int value = 10;
        int position = 4; 
        for(int i=0; i<arr.length+1;i++)
        {
            if(i<position-1)
            {
                arr1[i] = arr[i];
            }
            else if (i == position-1)
            {
                arr1[i] = value;
            }
            else
            {
                arr1[i]= arr[i-1];

            }
        }

        System.out.println(Arrays.toString(arr1));
    }
}
