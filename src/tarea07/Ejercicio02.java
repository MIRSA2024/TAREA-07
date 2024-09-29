/*
Determinar si un número es múltiplo de 3
Este programa permite al usuario introducir varios números y verificar si son múltiplos de 3. 
Se repite el proceso para varios números hasta que el usuario decida parar.
 */
package tarea07;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int numero;
        char continuar;
        
        do {
            System.out.print("Introduce un numero entero: ");
            numero = lectura.nextInt();
            
            if (numero % 3 == 0) {
                System.out.println(numero + " es multiplo de 3.");
            } else {
                System.out.println(numero + " no es multiplo de 3.");
            }
            
            System.out.print("¿Quieres verificar otro numero? (SI/NO): ");
            continuar = lectura.next().charAt(0);
            
        } while (continuar == 's' || continuar == 'S');

    }
}
