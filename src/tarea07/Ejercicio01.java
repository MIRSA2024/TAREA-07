/*
Validar contraseña con intentos limitados
Este programa solicita al usuario que introduzca una contraseña, permitiendo hasta tres intentos. 
Si la contraseña es correcta, termina el programa; de lo contrario, le da una advertencia en cada intento fallido.
 */
package tarea07;

import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String contrasenaCorrecta = "soyfeliz";
        String contrasena;
        int intentos = 0;
        boolean accesoConcedido = false;

        do {
            System.out.print("Introduce la contraseña: ");
            contrasena = sc.nextLine();
            intentos++;
            
            if (contrasena.equals(contrasenaCorrecta)) {
                accesoConcedido = true;
                System.out.println("Acceso concedido.");
            } else {
                System.out.println("Contraseña incorrecta.");
            }
        } while (!accesoConcedido && intentos < 3);

        if (!accesoConcedido) {
            System.out.println("Has alcanzado el numero maximo de intentos.");
        }

    }
}
