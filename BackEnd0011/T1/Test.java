package BackEnd0011.T1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    
    public static void main(String[] args) {
        final int energySize = 5;
        List<String> energy = new ArrayList<>();
        Producer producer = new Grass(energy, energySize);
        Consumer consumer1 = new Cow(energy);
        Consumer consumer2 = new Cow(energy);

        Thread grassThread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                producer.produce();
            }
        });

        Thread cow1Thread = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                consumer1.consume();
            }
        });

        Thread cow2Thread = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                consumer2.consume();
            }
        });

        grassThread.start();
        cow1Thread.start();
        cow2Thread.start();
    }
}


