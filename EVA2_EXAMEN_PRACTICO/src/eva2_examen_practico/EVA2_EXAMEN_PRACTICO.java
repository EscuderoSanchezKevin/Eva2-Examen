/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_examen_practico;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_EXAMEN_PRACTICO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        String piedra, papel, tijeras;
         System.out.println("Jugaremos a piedra, papel o tijeras");
         
        boolean jugar = true;
        while (jugar) {
         System.out.println("Ingrese 'piedra, papel o tijeras' para jugar o 'salir' para terminar:");
            String usuario = scanner.nextLine().toLowerCase();

        if (usuario.equals("salir")) {
         System.out.println("Gracias por jugar");
         break;
        }
        if (!usuario.equals("piedra") && !usuario.equals("papel") && !usuario.equals("tijeras")) {
         System.out.println("Por favor, ingrese piedra, papel o tijeras.");
            }

     }  
}
