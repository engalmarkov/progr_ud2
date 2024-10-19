/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ud2_2.pkg12dni;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ud2_212DNI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numDni;
        int letraDni;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Inserte su numero de DNI: ");
        numDni = sc.nextInt();
        
        letraDni = numDni%23;
        
        switch (letraDni) {
            case 0:
                System.out.println("La letra que corresponde es T");
                break;
            case 1:
                System.out.println("La letra que corresponde es R");
                break;
            case 2:
                System.out.println("La letra que corresponde es W");
                break;
            case 3:
                System.out.println("La letra que corresponde es A");
                break;
            case 4:
                System.out.println("La letra que corresponde es G");
                break;
            case 5:
                System.out.println("La letra que corresponde es M");
                break;
            case 6:
                System.out.println("La letra que corresponde es Y");
                break;
            case 7:
                System.out.println("La letra que corresponde es F");
                break;
            case 8:
                System.out.println("La letra que corresponde es P");
                break;
            case 9:
                System.out.println("La letra que corresponde es D");  
                break;
            case 10:
                System.out.println("La letra que corresponde es X");  
                break;
            case 11:
                System.out.println("La letra que corresponde es B");  
                break;
            case 12:
                System.out.println("La letra que corresponde es N");  
                break;
            case 13:
                System.out.println("La letra que corresponde es J"); 
                break;
            case 14:
                System.out.println("La letra que corresponde es Z");  
                break;
            case 15:
                System.out.println("La letra que corresponde es S"); 
                break;
            case 16:
                System.out.println("La letra que corresponde es Q"); 
                break;
            case 17:
                System.out.println("La letra que corresponde es V"); 
                break;
            case 18:
                System.out.println("La letra que corresponde es H");  
                break;
            case 19:
                System.out.println("La letra que corresponde es L"); 
                break;
            case 20:
                System.out.println("La letra que corresponde es C");
                break;
            case 21:
                System.out.println("La letra que corresponde es K");
                break;
            case 22:
                System.out.println("La letra que corresponde es E"); 
                break;
        }
    }
    
}
