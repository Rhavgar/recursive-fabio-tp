package recursive.fabio.tp;

public class VectorSumRecursive
{
    public int calculateVectorSum(int vector[], int size)
    {        
        if(size == 0)
        {
            return 0;
        }
        else
        {
            return vector[size - 1] + calculateVectorSum(vector, size - 1);
        }
    }
}
