public class SmartTv {
    
    boolean ligada = false;
    int volume = 25;
    int canal = 1;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando para " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo para " + volume);

    }

    public void aumentarCanal() {
        canal++;
        System.out.println("Canal atual " + canal);

    }

    public void diminuirCanal() {
        canal--;
        System.out.println("Canal atual " + canal);
    }

    public void selecionarCanal(int canal) {
        this.canal = canal;
        System.out.println("Canal atual " + canal);
    }
}