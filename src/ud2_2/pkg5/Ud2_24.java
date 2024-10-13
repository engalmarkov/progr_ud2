/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ud2_2.pkg4;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ud2_24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numA;
        int numB;
        boolean isMultiple;
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduzca el primer numero: "); //Solicitamos que introduzcan el número
        numA = sc.nextInt();
        System.out.print("Introduzca el segundo numero: ");
        numB = sc.nextInt();
        
        isMultiple = numA%numB == 0; // Verificamos si numA es múltiplo de numB
        System.out.print("El primer numero es multiplo del segundo: " + isMultiple + "\n");
        
    }
    
}
