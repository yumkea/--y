package BackEnd0011.T11;

public class Test {
    public static void main(String[] args) {
        Cow cow2 = new Cow("小黑");
        Cow cow1 = new Cow("小黄");
        Grass grass = new Grass("小绿");

        Thread cow1Thread = new Thread(cow1::consume);
        Thread cow2Thread = new Thread(cow2::consume);
        Thread grassThread =  new Thread(grass::produce);

        grassThread.start();
        cow1Thread.start();
        cow2Thread.start();
        //System.out.println("神态系统能量为"+Energy.energy+"生态系统灭亡");

    }
}
