package BackEnd0011.T2;

public class Player {
    private int hp;
    Object object=new Object();
    public Player() {
        this.hp = 100;
    }



    //同步方法：
    public synchronized void attack(String name) {
        for (int i = 0; i < 3; i++) {
            hp -= 20;
            System.out.println(name + " attack...");

            System.out.println(name + ": 当前player的hp值= " + hp);
            if (hp == 0) {
                System.out.println(name + ": player is dead.");
                break;
            }
        }
        System.out.println(name + " end.");
    }
/*
    //同步块
    public void attack(String name) {
        synchronized (object) {
            for (int i = 0; i < 3; i++) {
                hp -= 20;
                System.out.println(name + " attack...");
                System.out.println(name + ": 当前player的hp值= " + hp);
                if (hp == 0) {
                    System.out.println(name + ": player is dead.");
                    break;
                }
            }
            System.out.println(name + " end.");
        }
    }*/
}