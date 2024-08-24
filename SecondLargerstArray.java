public class SecondLargerstArray 
{
    public static int secondLargestNumber(int[] arr, int n )
    {
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<n;i++)
        {
            if(largest<arr[i])
            largest = arr[i];
           
        }

        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0; i<n;i++)
        {
            if(arr[i]>secondLargest && arr[i]<largest)
            secondLargest= arr[i];
        }
        return secondLargest;

    } 

    public static void main(String[] args) {
        int[] arr = {3,6,8,4,2,9};
        int n = arr.length;
        int answer = secondLargestNumber(arr, n);
        System.out.println("the second largest number of array is :"+ answer);
    }
    
    
}
