package Patterns;

public class Pattern3 
{
    public static void pattern3(int n)
    {
        for(int i=1;i<=n;i++)
        {
            System.out.println();

            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");

            }

        }

    }
    public static void main(String[] args) {
        pattern3(5);
    }
}
