package exemplo;

public class App {
    public static void main(String[] args) throws Exception {
        ThreadE t1 = new ThreadE(10);
        ThreadE t2 = new ThreadE(10);
        // ThreadI t3 = new ThreadI("TI", 10);
        // ThreadI t4 = new ThreadI("Thread", 10);
        // Thread t3e = new Thread(t3);
        // Thread t4e = new Thread(t4);


        t1.start();
        t2.start();
        // t3e.start();
        // t4e.start();
    }
}
