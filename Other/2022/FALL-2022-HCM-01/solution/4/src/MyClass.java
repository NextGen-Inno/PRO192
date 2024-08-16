
public class MyClass implements IProcess
{
    public boolean isDigit(char input)
    {
        if(input >='0' && input<='9') return true;
        else
        {
            return false;
        }
    }
    @Override
    public long factorial(int i) 
    {
        long mul = 1;
        for(int j=1;j<=i;j++)
        {
            mul*=j;
        }
        return mul;
    }

    @Override
    public String checkString(String string) 
    {
        String c = new String("HD");
        String result = new String("Fail");
        if(string.length() == 8)
        {
            if( string.substring(0,2).equals(c) || string.substring(0,2).equals(c.toLowerCase()) )
            {
                if(isDigit(string.charAt(2)) && isDigit(string.charAt(3)) && isDigit(string.charAt(4)) && isDigit(string.charAt(5)) && isDigit(string.charAt(6))&& isDigit(string.charAt(7)))  
                {
                    result = "Success";
                }
            }
        }
        return result;
    }
    
}
