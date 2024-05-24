import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
        
        System.out.println("digite o primeiro parametro: ");
        int parametroUm = terminal.nextInt();

        System.out.println("digite o segundo parametro");
        int parametroDois = terminal.nextInt();

        try{
            contar(parametroUm, parametroDois);
        }catch(ParametrosInvalidosExeption Exception){
            System.out.println("o primeiro parametro deve ser menor que o segundo");
        }
        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosExeption{
        if (parametroDois<parametroUm){
            throw new ParametrosInvalidosExeption();
        }
        for(int i = 0; (parametroUm + i) <= parametroDois; i++){
            System.out.println("numero de ocorrencias: "+i);
        }
    }
}
