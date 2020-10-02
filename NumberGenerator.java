public class NumberGenerator extends Thread {
    @Override
    public synchronized void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName()+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }


    public static void main(String[] args) {
    NumberGenerator t1 = new NumberGenerator();
    NumberGenerator t2 = new NumberGenerator();
    t1.setName("a");
    t2.setName("b");
    t1.start();
    t2.start();
    }

}
