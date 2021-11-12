/**
 * project euler 2
 * @link https://projecteuler.net/problem=2
 */
public class EvenFibonacciNumbersSolution {

    private static final int MAX = 4000000;
    public static int solve()
    {
        int result = 2;
        int firstNumber = 1;
        int secondNumber = 2;
        int currentNumber = 0;

        while (currentNumber <= MAX)
        {
            currentNumber   = firstNumber + secondNumber;
            firstNumber     = secondNumber;
            secondNumber    = currentNumber;

            if(currentNumber % 2 == 0 && currentNumber <= MAX )
            {
                result += currentNumber;
            }
        }

        return  result;
    }
    public static void main(String[] args)
    {
        System.out.println(solve());
    }
}
