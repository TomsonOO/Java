

abstract class Triangle extends Figure  implements Printable {

    int a, b, c;

    public Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public void printf() {
        System.out.println("a: " + this.a + "%nb: " + this.b + "%c: " + this.c);
    }

}
