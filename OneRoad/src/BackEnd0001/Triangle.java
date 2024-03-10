package BackEnd0001;

public class Triangle {
    private double a;
    private double b;
    private double c;
    public Triangle(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double area() throws NotTriangle {
        double cos = (a*a+b*b-c*c)/2*a*b;
        if(cos >=1 || cos <=-1){
            throw new NotTriangle("非三角形");
        }
        double perimeter = (a+b+c)/2;
        return Math.sqrt(perimeter*(perimeter-a)*(perimeter-b)*(perimeter-c));
    }


    public static void main(String[] args){
        Triangle triangle1 = new Triangle(3.0,4.0,5.0);
        Triangle triangle2 = new Triangle(1.0,1.0,2.0);


        try {
            System.out.println("S = "+triangle1.area());
        } catch (NotTriangle e) {
            System.out.println("非三角形");
            e.printStackTrace();
        }

        try {
            System.out.println("S = "+triangle2.area());
        } catch (NotTriangle e) {
            System.out.println("非三角形");
            e.printStackTrace();
        }
    }

}
