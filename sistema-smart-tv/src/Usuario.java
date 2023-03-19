public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal inicial: " + smartTv.canal);
        System.out.println("Volume inicial: " + smartTv.volume);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();

        smartTv.aumentarCanal();
        smartTv.mudarCanal(10);
        smartTv.diminuirCanal();
        smartTv.aumentarCanal();
        
        smartTv.desligar();
      
    }
}
