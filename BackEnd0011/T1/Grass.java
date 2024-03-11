package BackEnd0011.T1;

import java.util.List;

// 实现生产者类
class Grass implements Producer {
    private List<String> energy;
    private int maxSize;

    public Grass(List<String> energy, int maxSize) {
        this.energy = energy;
        this.maxSize = maxSize;
    }

    @Override
    public void produce() {
        synchronized (energy) {
            while (energy.size() == maxSize) {
                try {
                    System.out.println("能量已满，暂停生成");
                    energy.wait();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            String item = "*";
            energy.add(item);
            System.out.println("生产者产出了 " + item);
            energy.notifyAll();
        }
    }


}