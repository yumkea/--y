package BackEnd0001;
//自定义异常类
public class NotTriangle extends Exception {

    private  String message;
    public NotTriangle(String message){
        super(message);
        this.message=message;
    }

}
