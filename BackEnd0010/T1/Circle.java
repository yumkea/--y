package BackEnd0010.T1;

public class Circle implements Perarea{
    private double r;
    public Circle(double r){
        this.r=r;
    }

    @Override
    public double get_area() {
        return r*r*Math.PI;
    }

    @Override
    public double get_perimeter() {
        return 2*Math.PI*r;
    }
}
