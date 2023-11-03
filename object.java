class adder
{
    public static int add(int x, int y)
    {
        return x+y;
    }}
    public class object{
        public static void main(String args[]){
            adder myadder= new adder();
            int result=myadder.add(8, 9);
System.out.println(+result);
        }
    }
