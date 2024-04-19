package Patterns;

public class Pattern6 
{
    public static void pattern6(int n)
    {
        for(int i=1;i<=n;i++)
        {
            System.out.println();

            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(j+" ");
            }
        }

    }  
    public static void main(String[] args) {
        pattern6(5);
    }  
}
