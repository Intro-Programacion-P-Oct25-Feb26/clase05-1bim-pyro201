/*
 * Realizar un programa en java que permita determinar
 * si un estudiante ha pasado el ciclo
 * se ingresa el promedio del estudiante
 * - Un estudiante pasa el ciclo si tiene un promedio
 * mayor o igual a 7.5. Si el estudiante aprueba el ciclo, presentar
 * un mensaje como sigue: Estudiante aprobado con un promedio: 8.1
 */
package ejemplo1;

import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author reroes
 */
public class Ejemplo1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // Condicionales simplesmain
       double limite_nota;
        double promedio;
        System.out.println("ingrese el valor a analizar");
        promedio = entrada.nextDouble( );
        System.out.println("ingrese el limite de las notas");
        limite_nota = entrada.nextDouble( );
                

        if (promedio >= limite_nota) {
            System.out.printf("Estudiante aprobado con un "
                    + "promedio: %.2f\n", promedio);
        }

        if (promedio == limite_nota) {
            System.out.printf("Estudiante aprobado con un "
                    + "promedio: %.2f\n", promedio);
        }

        if (promedio < limite_nota) {
            System.out.printf("Estudiante aprobado con un "
                    + "promedio: %.2f\n", promedio);
        }
    }

}
