public class Bathroom {

    private Toilet toilet;

    public Bathroom(Toilet t) {
        this.toilet = t;
    }

    public void enter() {

        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " entering bathroom");
            toilet.use();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " leaving bathroom");
        }
    }
        public synchronized void wasHands(){
            System.out.println(Thread.currentThread().getName() + " washing hands");
        }
    }
