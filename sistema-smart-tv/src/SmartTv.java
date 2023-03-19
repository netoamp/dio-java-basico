public class SmartTv {
    boolean ligada =  true;
    int canal = 1;
    int volume = 25;


    public void ligar(){
        ligada = true; 
        System.out.println("Liguei a TV. TV ligada? " + ligada);
    }

    public void desligar(){
        ligada = false; 
        System.out.println("Desliguei a TV. TV ligada? " + ligada);
    }

    public void aumentarVolume () {
        volume++;
        System.out.println("Aumentei o volume. Volume atual: " + volume);
    }

    public void diminuirVolume () {
        volume--;
        System.out.println("Diminui 1 volume. Volume atual: " + volume);
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Mudei para o canal " + canal);
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Aumentei 1 Canal. Canal atual: " + canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Diminui 1 Canal. Canal atual: " + canal);
    }
}
