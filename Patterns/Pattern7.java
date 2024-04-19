package Patterns;

public class Pattern7
{
    public static void pattern7(int n)
    {
        for(int i=0;i<=n;i++)
        {
            System.out.println();

            for(int j=0;j<n-i+1;j++)
            {
                System.out.print(" ");
            }

            for(int j=0; j<2*i+1;j++)
            {
                System.out.print("*");
            }
        }

    } 
    
    public static void main(String[] args) {
        pattern7(4);
    }
}
