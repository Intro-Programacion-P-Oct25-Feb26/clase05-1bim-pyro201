/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo06;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author A S U S
 */
public class Ejemplo06 {
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombre;
        String apellido;
        String usuario;
        int edad;
        String parroquia;
        int diaPago;
        int mensualidad = 25;
        double totalDes;
        double total;
        System.out.println("Ingrese su nombre por favor");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su apellido por favor");
        apellido = entrada.nextLine();
        System.out.println("Ingrese su parroquia por favor");
        parroquia = entrada.nextLine();
        System.out.println("Ingrese su Usuario por favor");
        usuario = entrada.nextLine();
        System.out.println("Ingrese su edad por favor");
        edad = entrada.nextInt();
        System.out.println("Ingrese su dia de pago por favor");
        diaPago = entrada.nextInt();
  
        if (diaPago<10 && (parroquia.equals("El Valle") || 
                parroquia.equals("El Sagrario")))
        {
            
            totalDes = (mensualidad * .05);
            total = (mensualidad-totalDes);
            System.out.printf("Nombre: %s\nApellido: %s\nUsuario: %s\nEdad: "
                    + "%s\nParroquia: %s\nDia de pago: %s\nMensualidad: $%s\n"
                    + "Descuento: $%s\nTotal a Pagar: $%s\n",nombre, apellido,usuario,
                    edad, parroquia, diaPago, mensualidad, totalDes, total);
        }
        else {
            System.out.printf("Nombre: %s\nApellido: %s\nUsuario: %s\nEdad: "
                    + "%s\nParroquia: %s\nDia de pago: %s\nMensualidad: $%s\n"
                    + "Descuento: $0\nTotal a Pagar: $%s\n",nombre, apellido, usuario,
                    edad, parroquia, diaPago, mensualidad, mensualidad);
        }
        
    
              
        // TODO code application logic here
    }
    
}
