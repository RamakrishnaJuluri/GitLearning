public class RotateArray 
{ 
    public static void reverseOfArray(int[] arr, int start, int end)
    {
        while(start<=end){
        int temp = arr[start];
        arr[start]= arr[end];
        arr[end] = temp;
        start++;
        end--;
        }
    }

    public static void rotateArray(int[] arr, int n, int k)
    {
        k = k%n;
        if(k<n)
        {
        //rotating elements uptok elements
        reverseOfArray(arr,0,k-1);
        //rotating last k elements
        reverseOfArray(arr, k, n-1);
        //rotate the total array
        reverseOfArray(arr,0 ,n-1);
        }
    }
    public static void main(String[] args) 
    {
        int[] arr = {10,20,30,40,50};
        int n = arr.length;
        int k =6;
        rotateArray(arr,n,k);
        for(int i =0; i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}
