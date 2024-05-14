
public class SmartTv {
    public boolean ligado=false;
    public int canal=1;
    public int volume=25;

    //Métodos para ligar e desligar
    public void ligar(){
        ligado=true;
    }
    public void desligar(){
        ligado=false;
    }

    //Métodos para mudar volume
    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }

    //Mé todos para mundança de canal
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void subirCanal(){
        canal++;
    }
    public void descerCanal(){
        canal--;
    }

}
