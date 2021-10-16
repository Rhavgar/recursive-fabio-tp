package recursive.fabio.tp;

public class StringReversalRecursive
{
    public String reserveString(String str)
    {      
        if(str.isEmpty())
        {
            return str;
        }
        else
        {
            return reserveString(str.substring(1)) + str.charAt(0);
        }
    }
}
