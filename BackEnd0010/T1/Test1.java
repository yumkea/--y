package BackEnd0010.T1;

public class Test1 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10,5);
        Circle circle = new Circle(5);
        System.out.println("rectangle ：C="+rectangle.get_perimeter()+"\tS:"+rectangle.get_area());
        System.out.println("circle ：C="+circle.get_perimeter()+"\tS:"+circle.get_area());
    }
}
