public class CalcularVelocidadeMedia {
    public static  void main(String[] args){
        System.out.println("CALCULO DE VELOCIDADE MÉDIA");
        // O DOUBLE é usado para guarda dados para ser usado no sistema
        double distanciaPercorrida = 150.0;
        System.out.println("A distancia percorrida foi de " + distanciaPercorrida + "Km");

        double tempoGasto = 1.5;
        System.out.println("O tempo gasto foi de " + tempoGasto + " horas");

        double velocidadeMedia = distanciaPercorrida / tempoGasto;
        System.out.println("Para encontrar a velocidade média " 
        + "dividimos a distância (" + distanciaPercorrida 
        + ") pelo tempo gasto no " 
        + "percuso (" + tempoGasto + ").");

        System.out.println("A velocidade média é de: " + velocidadeMedia + "Km/h");
    }
}
