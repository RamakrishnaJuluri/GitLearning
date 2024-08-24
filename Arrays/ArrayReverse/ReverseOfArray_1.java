package Arrays.ArrayReverse;

public class ReverseOfArray_1 
{
    public static void reverseOfArray(int[] arr)
    {
        int[] revarray = new int[arr.length];

        for(int i=0; i<arr.length; i++)
        {
             revarray[i]= arr[arr.length-i-1];
        }

        for( int element: revarray)
        {
            System.out.print(element + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        ReverseOfArray_1.reverseOfArray(arr);
    }
}
