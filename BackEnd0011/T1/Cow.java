package BackEnd0011.T1;


import java.util.List;

class Cow implements Consumer{
    private List<String> energy;


    public Cow(List<String> energy) {
        this.energy = energy;
    }

    @Override
    public void consume() {
        synchronized (energy) {
            while (energy.isEmpty()) {
                try {
                    System.out.println("能量耗尽，等待生产者产出");
                    energy.wait();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            String item = energy.remove(0);
            System.out.println("消费者消费了" + item);
            energy.notifyAll();
        }
    }
}
