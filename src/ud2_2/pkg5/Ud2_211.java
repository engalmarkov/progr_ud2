/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ud2_2.pkg11;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ud2_211 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num; //Declaramos un int, ya que al ser capicúa debe ser entero
        boolean isPalindrome = false; //Declaramos un booleano, para indicar si es cierto o no que es capicúa
        int units;
        int tens;
        int hundreds;
        int thousands;
                
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Inserta un numero entre 0 y 9999: ");
        num = sc.nextInt();
     
        //Declaramos un if else, donde primero deberemos comprobar que no se introduzcan
        //números diferentes a ese rango
        
        if (num < 0 || num > 9999){
            System.out.println("Numero incorrecto. El numero debe estar entre 0 y 9999");
            System.exit(0);
        } else if (num < 10){
            isPalindrome = true;
        } else if (num < 100) {
            tens = num / 10;
            units = num % 10;
            isPalindrome = (tens == units);
        } else if (num < 1000) {
            hundreds = num / 100;
            units = num % 10;
            isPalindrome = (hundreds == units); 
        } else {
            thousands = num / 1000;
            hundreds = (num / 100) % 10;
            tens = (num / 10) % 10 ;
            units = num % 10;
            isPalindrome = (units == thousands) && (hundreds == tens);
        }     
        if (isPalindrome) { 
            System.out.println("Enhorabuena, el numero " + num + " es capicua.");
        } else {
            System.out.println("Lo sentimos, el numero " + num + " no es capicua.");
        }
    }
}
