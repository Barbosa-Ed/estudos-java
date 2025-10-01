package control;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class DinoThread extends JLabel implements Runnable {
    private Thread dinoThread = null;
    private int posX;
    private int posY;
    private ImageIcon imagem;
    private static int pos=0;
    private String nome;
    // CONSTRUTOR DEFAULT
    public DinoThread() {
       
    }
    // CONSTRUTOR SOBRECARREGADO
    public DinoThread(String nome, ImageIcon img, int posX, int posY){
    super(img);
    this.imagem = img;
    this.posX = posX;
    this.posY = posY;
    this.nome = nome;
 
    dinoThread = new Thread(this, nome);
    dinoThread.start();
   
    }
    // M�TODO RUN() DA INTERFACE RUNNABLE
    @Override
    public void run() {
        posX += new Random().nextInt(3) * 100;
        this.setLocation(posX, posY);

        if (posX >= 1280) {
        	pos++;
        	 JOptionPane.showMessageDialog(null, pos + ")" + nome);
        	return;

        }
            
        try {
            Thread.sleep(new Random().nextInt(5) * 100);
            run();
        } catch (Exception e) {
            e.printStackTrace();
        }
   }
}