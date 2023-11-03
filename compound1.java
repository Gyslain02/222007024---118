class money
{
    public static double cash(double p, double r, double t)
    {
        return Math.pow(1+r,t)*p;
    }}
   public class compound1
   {
    public static void main(String args[])
    {
   money mymoney= new money();
   double result= mymoney.cash(500000, 0.18, 3);
   System.out.println(+result);
    }
}