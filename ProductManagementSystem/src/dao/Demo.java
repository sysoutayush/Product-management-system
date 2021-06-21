public class Dummy
{
    public int a=10;
}
 
class Demo extends Dummy {
    public static void main(String[] args) {
        Demo ex=new Dummy();
        System.out.println(ex.a);
    }
}
