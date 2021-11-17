
public class LargestPalindromeProduct {

    public static int getLargestPalindromeProduct(int numberOfDigit)
    {
        int largestPalindrome = 0;

        int upper = (int) (Math.pow(10, numberOfDigit) - 1);
        int lower = 1 + upper/10;

        for (int i = lower ; i <= upper ; i++ )
        {
            for (int j= i; j <= upper ; j++)
            {
                if(isPalindromeNumber(i*j))
                {
                    if(largestPalindrome < i*j)
                    {
                        largestPalindrome = i*j;
                    }
                }
            }
        }
        return largestPalindrome;
    }

    public static boolean isPalindromeNumber(int n)
    {
        int revers = 0;
        int number = n;
        while (number != 0)
        {
            revers  = revers * 10 + number%10;
            number /= 10;
        }

        return revers == n;
    }
    public static void main(String[] args)
    {
        System.out.println(getLargestPalindromeProduct(3));
    }
}
