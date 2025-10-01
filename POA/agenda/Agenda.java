import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Agenda {

    Agenda() {
        File dir = new File("c:/arquivo");

        if(!dir.exists()) {
            dir.mkdir();
        }
    }

    public void escrita(String nome, String telefone){
        try(FileWriter fw = new FileWriter("c:/arquivo/agenda.txt",true); BufferedWriter bw = new BufferedWriter(fw)) {

            bw.write(nome + ";" + telefone);
            bw.newLine();
            
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
    }

    public void lerTodos() throws FileNotFoundException, IOException {
        try (FileReader fr = new FileReader("c:/arquivo/agenda.txt"); BufferedReader br = new BufferedReader(fr)) {while(br.ready()) {
                String aux = br.readLine();
                String [] dados = aux.split(";");
                
                System.out.println("Nome: " + dados[0] + " - Telefone: " + dados[1]);
            }
            br.close();
        }
    }

    public void ler(String nome) throws FileNotFoundException, IOException {
        try (FileReader fr = new FileReader("c:/arquivo/agenda.txt"); BufferedReader br = new BufferedReader(fr);) {
            while(br.ready()) {
                String aux = br.readLine();

                if(aux.contains(nome)) {    
                    String [] dados = aux.split(";");
                    
                    System.out.println("Nome: " + dados[0] + " - Telefone: " + dados[1]);
                }
            }
            br.close();
        }
    }
    

}