public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("A Tv está ligada ? " + smartTv.ligada);
        System.out.println("Canal atual : " + smartTv.canal);
        System.out.println("Volume atual : " + smartTv.volume);

        smartTv.ligar();
        System.out.println("A Tv está ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("A Tv está ligada ? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual : " + smartTv.volume);

        smartTv.selecionarCanal(38);
        System.out.println("Canal atual : " + smartTv.canal);

        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        System.out.println("Canal atual : " + smartTv.canal);

    }
}
