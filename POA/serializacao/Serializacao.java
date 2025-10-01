import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//Coé, nesse aqui eu fui gênio demais

public class Serializacao{
    public static void main(String[] args) throws Exception {
        Estudante est = new Estudante("Ed", "2310470", "ADS", "abc123");
        File f = new File(System.getProperty("user.dir") + "\\serializacao\\serializado");

        if(!f.exists()) f.mkdir();

        //serializar
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f.toString() + "\\estudante.ser"))) {
            out.writeObject(est);
            System.err.println("Foi!");
        } catch(IOException e) {
            System.out.println("Num foi!");
            e.printStackTrace(System.err);
        }

        //desserializar
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(f.toString() + "\\estudante.ser"))) {
            Estudante recuperado = (Estudante) in.readObject();

            System.out.println("O objeto desserializado: " + recuperado);
        } catch(IOException | ClassNotFoundException e) {
            System.out.println("Num recuperou!");
            e.printStackTrace(System.err);
        }
    }
}