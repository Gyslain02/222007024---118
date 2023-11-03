class money
{
    public static double cash(double p, double r, double t)
    {
        return p*r*t;
    }}
public class simple1
{
    public static void main(String args[])
    {
        money mymoney= new money();
        double result= mymoney.cash(100000, 0.05, 5);
        System.out.println(+result);
    }
}