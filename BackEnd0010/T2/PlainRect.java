package BackEnd0010.T2;

public class PlainRect extends Rect{
    //两个属性
    private double startX;
    private double startY;
    //两个构造方法
    //无参构造
    public PlainRect(){
        super();
        startX=0;
        startY=0;
    }
    //有参构造
    public PlainRect(double startX,double startY,double width,double height){
        super(width, height);
        this.startY=startY;
        this.startX=startX;
    }

    //判断点位置的方法
    public boolean isInside(double x,double y){
        return  (x > startX
                && x <= (startX + super.getWidth())
                && y < startY
                && y >= (startY - super.getHeight()));
    }

}
