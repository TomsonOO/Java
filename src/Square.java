


abstract public class Square extends Figure implements Printable  {

    int a;

    public Square(int a)
    {
        this.a = a;
    }

    @Override
    public void printf() {
        System.out.println("a: " + this.a);
    }

}
