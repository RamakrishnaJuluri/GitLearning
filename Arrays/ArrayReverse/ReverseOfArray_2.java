package Arrays.ArrayReverse;

public class ReverseOfArray_2 
{
        public static void reverseOfArray(int[] arr, int start,int end)
        {
            start =0;
            end = arr.length-1;
            while(start < end)
            {
                int temp = arr[start];
                arr[start] = arr[end];
                 arr[end]= temp;
                 start ++;
                 end --;
            }
        }

        static void printArray(int arr[], int size) { 
            for (int i = 0; i <= size; i++) 
                System.out.print(arr[i] + " "); 
            System.out.println(); 
        }


    public static void main(String[] args) 
    {
        int arr[] = {1,2,3,4,5};
        printArray(arr, 4);
        ReverseOfArray_2.reverseOfArray(arr, 0, 4);
        System.out.print("Reversed array is \n"); 
        printArray(arr, 4); 
    }
    
}
