package recursive.fabio.tp;

public class ConversionRecursive
{
    public int convertDecimalToBinary(int x)
    {
        if(x == 0)
        {
            return 0;
        }
        else
        {
            return (x % 2 + 10 * convertDecimalToBinary(x / 2));
        }
    }
    
    public String convertDecimalToHexadecimal(int x)
    {
        String str = "";
        
        if(x > 0)
        {
            String hexNumber = convertDecimalToHexadecimal(x / 16);
            String hexCode = "0123456789ABCDEF";
            int hexDigit = x % 16;
            
            str = hexNumber + hexCode.charAt(hexDigit);
        }
        
        return str;
    }
}
