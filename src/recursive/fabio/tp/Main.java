package recursive.fabio.tp;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\nFibonacci");
        FibonacciRecursive fr = new FibonacciRecursive();
        System.out.println(fr.calculateFibonacci(7));
        
        
        System.out.println("\nSomar valores do vetor");
        VectorSumRecursive vsr = new VectorSumRecursive();
        int vector[] = {1, 2, 3, 4};
        System.out.println(vsr.calculateVectorSum(vector, vector.length));
        
        
        System.out.println("\nReverter string");
        StringReversalRecursive srr = new StringReversalRecursive();
        System.out.println(srr.reserveString("testando"));
        
        
        System.out.println("\nEncontrar maior numero no vetor");
        VectorHighestValueRecursive vhvr = new VectorHighestValueRecursive();
        int vector2[] = {1, 3, 7, 5};
        System.out.println(vhvr.vectorHighestValue(vector2, vector2.length));
        
        
        System.out.println("\nConverter decimal para binario e hexadecimal");
        ConversionRecursive cr = new ConversionRecursive();
        System.out.println(cr.convertDecimalToBinary(42));
        System.out.println(cr.convertDecimalToHexadecimal(42));
    }
    
}
