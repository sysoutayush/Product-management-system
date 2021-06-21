public class Dummy
{
    public int a=10;

}

class Print
{
    public static void main(String[] args) {
        {
            Print ex= new Dummy();
            System.out.println(ex.a);
        }
    }
}