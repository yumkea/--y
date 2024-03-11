package BackEnd0011.T2;

public class Test {

    public static void main(String[] args) {
        Player player = new Player();

        Thread AThread = new Thread(() -> {
            player.attack("Creep-A");
        });

        Thread BThread = new Thread(() -> {
            player.attack("Creep-B");
        });

        AThread.start();
        BThread.start();
    }


}
