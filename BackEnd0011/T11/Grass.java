package BackEnd0011.T11;

public class Grass implements Producer {


    private String name;

    public Grass(String name) {
        this.name = name;
    }

    @Override
    public void produce() {


        synchronized (Energy.obj) {
            while (true) {
                if (Energy.energy == 0) {
                    break;
                }
                Energy.energy++;
                System.out.println(name + "产出了第" + Energy.energy + "份能量");
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
//            Energy.obj.notifyAll();
        }
    }
}
