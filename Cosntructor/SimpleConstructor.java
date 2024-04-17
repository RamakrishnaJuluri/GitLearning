package Cosntructor;

public class SimpleConstructor  

{
    int sum;
 
    public SimpleConstructor(int a, int b)
    {
        sum = a+b;
        System.out.println("the additon of a and b is "+sum);

    }
    public static void main(String[] args) 
    {
        SimpleConstructor sc = new SimpleConstructor(3,4);
        
    }
    
}



