package BasicProgramme;
import java.util.Random;
// import java.util.concurrent.ThreadLocalRandom;

//below programme is to create random number and print with java.util.Random; package
public class randomNumber 
{
    public static void main (String args[])
    {
        Random randomnumber = new Random(); 
        int rand_int1 = randomnumber.nextInt(1000);
        System.out.println(rand_int1);


    }
    
}

//below programme is to create random number and print with Math.random(); function
// public class randomNumber
// {
//     public static void main (String args[])
//     {
//         System.out.println("Random number:" + Math.random());


//     }
    
// }

// Java program to demonstrate working of ThreadLocalRandom
// to generate random numbers.
// public class randomNumber
// {
//     public static void main (String args[])
//     {
//         int rand_int = ThreadLocalRandom.current.nextInt();

//         double rand_double = ThreadLocalRandom.current.nextDouble();

//         Boolean rand_bool = ThreadLocalRandom.current.nextBoolean();
//     }
    
    
// }