package BackEnd0010.T1;

public class Rectangle implements Perarea{
    private double length;
    private double width;
    public Rectangle(double length,double width){
        this.width=width;
        this.length=length;
    }
    @Override
    public double get_area() {
        return width*length;
    }

    @Override
    public double get_perimeter() {
        return 2*(width+length);
    }
}
