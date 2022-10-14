


abstract public class Circle extends Figure implements Printable {

    int radius;

    public Circle(int radius){

        this.radius = radius;
    }

    @Override
    public void printf() {
        System.out.println("Radius: " + this.radius);
    }
}
