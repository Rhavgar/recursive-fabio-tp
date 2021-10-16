package recursive.fabio.tp;

public class VectorHighestValueRecursive
{
    public int vectorHighestValue(int vector[], int size)
    {
        if(size == 1)
        {
            return vector[0];
        }
        else
        {
            int aux = vectorHighestValue(vector, size - 1);
            return (vector[size - 1] > aux) ? vector[size - 1] : aux;
        }
    }    
}
