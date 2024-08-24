package Arrays.ArrayRotation;

public class ArrayRotation 
{
    // where k = number of rotations and start rotation is intialising the rotation
    
    public static void arrayRotation(int[] arr, int k, int n)
    {
        int start_rotation = 1;
        while(start_rotation <= k)
        {
            int temp = arr[0];

            for(int i=1; i<n;i++)
            {
                arr[i-1] = arr[i];
            }

             arr[n-1] = temp;
             start_rotation++;
        }

        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        ArrayRotation.arrayRotation(arr,2,n);
    }

}
