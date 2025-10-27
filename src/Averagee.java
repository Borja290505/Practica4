package ed.ud4;
import java.util.Random;

public class Averagee {

    public static void main(String[] args) {
        // Crear un objeto Random para generar números aleatorios
        Random random = new Random();

        // Obtener un número aleatorio entre 0 y 19 (ambos incluidos)
        int count = random.nextInt(20);  // nextInt(20) genera un número entre 0 y 19
        System.out.println("Cantidad de números a generar: " + count);

        // Inicializar una variable para la suma total
        int total = 0;

        // Generar tantos números aleatorios entre 1 y 50 como se haya obtenido en el punto anterior
        for (int i = 0; i < count; i++) {
            int numeroAleatorio = random.nextInt(100) + 1;  // nextInt(100) genera entre 0 y 99, sumamos 1 para que sea entre 1 y 100
            total += numeroAleatorio;
            System.out.println("Número aleatorio " + (i + 1) + ": " + numeroAleatorio);
        }

        // Mostrar la suma total
        System.out.println("Suma total de los números generados: " + total);

        // Mostrar la media
        double media = (double) total / (double) count;
        System.out.println("Media: " + media);

        // Mensaje de fin de proceso
        System.out.println("Fin de proceso");

    }
}