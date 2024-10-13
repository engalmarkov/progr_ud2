/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ud2_2.pkg5;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ud2_25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int maxCapacity;
        double ticketPrice;
        int ticketSold;
        double moneyRaised;
        
        Scanner sc = new Scanner (System.in);
        //Solicitamos que introduzcan el aforo, precio de entradas y entradas vendidas
        //No puede haber ni un aforo, ni precio, ni entradas vendidas en valores negativos, 
        //con lo que declaramos un if por cada variable para evitar errores
        System.out.print("Introduzca el aforo máximo: "); 
        maxCapacity = sc.nextInt();
                if (maxCapacity < 0){
          System.out.print ("El número introducido es erróneo, inténtelo de nuevo. ");
          System.exit(0); //Cerraríamos el programa aquí, volviendo a empezar para introducirlo nuevamente
        }
        
        System.out.print("Introduzca el precio de las entradas: ");
        ticketPrice = sc.nextDouble();
        if (ticketPrice < 0){
            System.out.print ("El precio introducido es erróneo, inténtelo de nuevo. ");
            System.exit(0); //Cerraríamos el programa aquí, volviendo a empezar para introducirlo nuevamente
        }
        
        System.out.print("Introduzca las entradas vendidas: "); 
        ticketSold = sc.nextInt();
        if (ticketSold < 0){
            System.out.print ("El número de entradas vendidas es erróneo, inténtelo de nuevo. ");
            System.exit(0); //Cerraríamos el programa aquí, volviendo a empezar para introducirlo nuevamente
        }
         if (maxCapacity < ticketSold) {
          System.out.print ("Las entradas vendidas deben ser inferiores al aforo, inténtelo de nuevo.");
          System.exit(0); //Cerraríamos el programa aquí, volviendo a empezar para introducirlo nuevamente
        }
         
        //Tampoco se pueden vender más entrada de lo permitido por aforo, declaramos también este límite
        //No puede haber ni un aforo, ni precio, ni entradas vendidas en valores negativos, 
        //con lo que declaramos un if por cada variable para evitar errores
         
        moneyRaised = (ticketSold * ticketPrice);
        //Declaramos mediante un if-else 
        
        if (ticketSold < maxCapacity*0.20) {
             System.out.print ("El concierto se cancela por motivos de aforo. ");
        } else if (ticketSold < maxCapacity*0.50) {
            moneyRaised = moneyRaised*0.75;
            System.out.print ("El precio total con el descuento aplicado es: " + moneyRaised + " euros." );
        } else {
            System.out.print ("El dinero total recaudado del concierto es: " + moneyRaised + " euros.");
        } 
    }   
}
