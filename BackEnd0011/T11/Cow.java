package BackEnd0011.T11;

public class Cow implements Consumer {
    private String name;

    public Cow(String name) {
        this.name = name;
    }

    @Override
    public void consume() {

        synchronized (Energy.obj) {
            while (true) {
                if (Energy.energy == 0) {
                    break;
                }
                Energy.energy--;
                System.out.println(name + "消费了第" + Energy.energy + "份能量");
                try {
                    Energy.obj.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);

                }

            }
            Energy.obj.notifyAll();
//            try {
//                Energy.obj.wait();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }

        }
    }
}
