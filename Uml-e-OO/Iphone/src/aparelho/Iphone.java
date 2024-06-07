package aparelho;
import aparelho.funcionalidades.MusicPlayer;
import aparelho.funcionalidades.Navegador;
import aparelho.funcionalidades.Telefone;

public class Iphone implements MusicPlayer, Telefone, Navegador {
    
    //funcionalidades music player
    @Override
    public void tocar() {
        System.out.println("tocando musica");
    }
    @Override
    public void pausar() {
        System.out.println("pausando...");
    }
    @Override
    public void selecionarMusica(String nomeMusica) {
        System.out.println("SELECIONANDO: " + nomeMusica);
    }

    //funcionalidades navegador
    @Override
    public void exibirPagina(String nomePagina) {
        System.out.println("Acessando a pagina " + nomePagina);
    }
    @Override
    public void adicionarNovaAba() {
        System.out.println("adicionando nova aba em branco");
    }
    @Override
    public void atualizarPagina() {
        System.out.println("atualizando pagina");
    }

    //funcionalidades telefone
    @Override
    public void telefonar(String numero) {
        System.out.println("telefonando para o numero " + numero);
    }
    @Override
    public void atender() {
        System.out.println("atendendo...");
    }
    @Override
    public void ouvirCorreioVoz() {
        System.out.println("ouvindo correio de voz");
    }

}
