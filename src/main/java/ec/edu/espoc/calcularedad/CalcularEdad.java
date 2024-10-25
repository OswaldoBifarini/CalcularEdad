/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espoc.calcularedad;
//subir esta practic a git hub

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class CalcularEdad {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("ingrese edad");
        int edad = e.nextInt();

        if (edad >= 0 && edad < 120) {
            //categoriza persona  
            if (edad >= 0 && edad <= 12) {
                System.out.println("Esres un niño");
            } else if(edad >= 13 && edad <= 35){
                System.out.println("Eres adulto");
            }
        } else {
            System.out.println("Error");
        }
    }
}
//git hub  es un almacenamiento, repositorio en la nuve
