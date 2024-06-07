import aparelho.Iphone;

public class Usuario {
    public static void main(String[] args) {
        Iphone aparelho = new Iphone();

        //testando music player
        aparelho.selecionarMusica("Numb - Linkin Park");
        aparelho.tocar();
        aparelho.pausar();

        //testando navegador
        aparelho.exibirPagina("Google.com");
        aparelho.atualizarPagina();
        aparelho.adicionarNovaAba();

        //testando telefone
        aparelho.telefonar("4002-8922");
        aparelho.atender();
        aparelho.ouvirCorreioVoz();
    }
}
