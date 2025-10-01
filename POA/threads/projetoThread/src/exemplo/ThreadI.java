package exemplo;

public class ThreadI implements Runnable {

    private String msg;
    private int tempo;

    public ThreadI(String msg, int tempo) {
        this.msg = msg;
        this.tempo = tempo;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(msg);
            try {
                Thread.sleep(tempo);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
