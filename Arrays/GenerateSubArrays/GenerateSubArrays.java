package Arrays.GenerateSubArrays;

public class GenerateSubArrays 
{
    public static void generateSubarrays(int[] arr, int n)
    {
        for(int i=0; i<n;i++)
        {
            for(int j=0; j<n;j++)
            {
                System.out.print(arr[i]);
                System.out.print(arr[j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int n = arr.length;
        GenerateSubArrays.generateSubarrays(arr, n);
    }
}
