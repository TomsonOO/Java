abstract public class Figure {

    double surfaceArea;
    double perimeter;

    public double calculatedArea(int a){

        System.out.println("Calculated Area here: " + surfaceArea);

        return a;
    }

    public double calculatedArea(int a, int b){

        System.out.println("Calculated Area here: " + surfaceArea);

        return a;
    }

    public double calculatedArea(int a, int b, int c){

        System.out.println("Calculated Area here: " + surfaceArea);

        return a;
    }

    public double calculatePerimeter(int a)
    {
        System.out.println("Calculated Perimeter: " + perimeter);
        return a;
    }

    public double calculatePerimeter(int radius, int b)
    {
        System.out.println("Calculated Perimeter: " + perimeter);
        return b;
    }

    public double calculatePerimeter(int a, int b, int c)
    {
        System.out.println("Calculated Perimeter: " + perimeter);
        return a;
    }


}
