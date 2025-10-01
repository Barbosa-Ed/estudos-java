package exemplo;

import java.util.Random;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class ThreadE extends Thread{
    private final String msg = "Bu!";
    private int tempo;

    public ThreadE(int tempo) {
        this.tempo = tempo;
    }

    public void run() {
        for(int i=0; i<5; i++) {
            JOptionPane optionPane = new JOptionPane(msg);

            JDialog dialog = optionPane.createDialog(null, "Mensagem");

            Random rand = new Random();

            dialog.setLocation(rand.nextInt(1000),rand.nextInt(1000));
            dialog.setVisible(true);
            try {
                Thread.sleep(tempo);
            } catch (InterruptedException e) {
                System.out.println("meh");
                e.printStackTrace(System.err);
            }
        }
    }
}
