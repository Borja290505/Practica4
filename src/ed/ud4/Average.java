package ed.ud4;

import java.util.Random;

public class Average {

    public static void main(String[] args) {
        Random random = new Random();

        int count = random.nextInt(20);  // entre 0 y 19
        System.out.println("Cantidad de números a generar: " + count);

        int total = 0;
        double producto = 1.0;
        int minimo = Integer.MAX_VALUE;
        int maximo = Integer.MIN_VALUE;

        for (int i = 0; i < count; i++) {
            int numeroAleatorio = random.nextInt(100) + 1;  // entre 1 y 100
            total += numeroAleatorio;
            producto *= numeroAleatorio;

            if(numeroAleatorio < minimo){
                minimo = numeroAleatorio;
            }

            if(numeroAleatorio > maximo){
                maximo = numeroAleatorio;
            }
            System.out.println("Número aleatorio " + (i + 1) + ": " + numeroAleatorio);
        }

        System.out.println("Suma total de los números generados: " + total);

        if (count > 0) {
            double media = (double) total / count;
            double mediaGeometrica = Math.pow(producto, 1.0 / count);
            System.out.println("Media aritmética: " + media);
            System.out.println("Media geométrica: " + mediaGeometrica);
            System.out.println("Valor minimo: " + minimo);
            System.out.println("Valor maximo: " + maximo);
        } else {
            System.out.println("No se han generado números, no se puede calcular la media.");
        }

        System.out.println("End of program");
    }
}