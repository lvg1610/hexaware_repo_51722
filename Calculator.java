public class Calculator implements First
{
    public int sum(int x,int y)
    {
        return x+y;
    }
    public int square(int x)
    {
        return x*x;
    }
    public int divide(int x,int y)
    {
        if(y!=0)
            return x/y;
        throw new ArithmeticException("Invalid Division by zero");
     }   
}
 
