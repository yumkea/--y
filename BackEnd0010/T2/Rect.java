package BackEnd0010.T2;

public class Rect {
    private double width;
    private double height;
    //构造
    public Rect(){
        width=10;
        height=10;
    }
    public Rect(double width,double height){
        this.width=width;
        this.height=height;
    }


    public double getWidth() {
        return width;
    }


    public double getHeight() {
        return height;
    }





    //实例方法 （没有static）
    public double area(){
        return height*width;
    }

    public double perimeter(){
        return 2*(height*width);
    }






}
