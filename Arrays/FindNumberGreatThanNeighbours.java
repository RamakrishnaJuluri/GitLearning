package Arrays;

public class FindNumberGreatThanNeighbours 
{
    public static int findNumberGreatThanNeighbours(int[] arr, int n)
    {
        if (n == 1)
            return 0;
        if (arr[0] >= arr[1])
            return 0;
        if (arr[n - 1] >= arr[n - 2])
            return n - 1;
        // Check for every other element
        for (int i = 1; i < n - 1; i++) {
            // Check if the neighbors are smaller
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1])
                return arr[i];
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,15,2,23,90,67};
        int n = arr.length;
      System.out.println(findNumberGreatThanNeighbours(arr, n));
    }
}
