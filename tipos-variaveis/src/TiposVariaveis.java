public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo= 2500;

        short numerocurto1 = 2;
        int numeroNormal = numerocurto1;
        short numerocurto2 =(short) numeroNormal;

        int numero = 5;
        numero = 10;
        System.out.println(numero);

        final double VALOR_DE_PI = 3.14;
        VALOR_DE_PI = 3.15;
    }
}
