/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ud2_2.pkg3;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ud2_23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numA;
        int numB;
        boolean areDifferent; //Declaramos las variables
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduzca el primer numero: "); //Solicitamos que introduzcan el número
        numA = sc.nextInt();
        System.out.print("Introduzca el segundo numero: ");
        numB = sc.nextInt();
        
        areDifferent = numA != numB || numA == 0 || numB == 0;
        System.out.print("Los numeros introducidos son distintos entre si,\n o uno de ellos es 0: " + areDifferent + "\n");
    }
    
}
