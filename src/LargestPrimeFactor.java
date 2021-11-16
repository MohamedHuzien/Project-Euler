/**
 * project euler 3
 * @link https://projecteuler.net/problem=3
 */
public class LargestPrimeFactor {

    public static long getLargestPrimeFactor(long n)
    {
        long largestFactor = 1;

        for(long i = 2  ; i < n ; i++)
        {
            while (n % i == 0)
            {
                if(i > largestFactor) {largestFactor = i;}
                n = n/i;
            }
        }


        return Math.max(largestFactor , n);
    }


    public static void main(String[] args)
    {
        System.out.println(getLargestPrimeFactor(600851475143L));
    }
}
