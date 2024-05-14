public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("\nTV Ligada? " + smartTv.ligado);
        System.out.println("canal atual: " + smartTv.canal);
        System.out.println("Volume da TV: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status ->TV Ligada? " + smartTv.ligado);

        smartTv.desligar();
        System.out.println("Novo status ->TV Ligada? " + smartTv.ligado);

        
    }
}
