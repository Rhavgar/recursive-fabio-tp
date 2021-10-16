package recursive.fabio.tp;

public class FibonacciRecursive
{
    public long calculateFibonacci(int x)
    {
        if(x <= 2)
        {
            return 1;
        }
        else
        {
            return calculateFibonacci(x - 1) + calculateFibonacci(x - 2);
        }
    }
}
