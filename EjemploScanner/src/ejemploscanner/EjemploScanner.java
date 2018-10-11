/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploscanner;

import java.util.Scanner;

/**
 *
 * @author jmartinezpineiro
 */
public class EjemploScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in); 
        float euros=0, valorDolar=0, cambioMoneda=0;
        System.out.println("Teclea euros: ");
        euros=leer.nextFloat();
         System.out.println("Teclea valorDolar: ");
        valorDolar=leer.nextFloat();
        cambioMoneda = euros*valorDolar;
        
        System.out.println("De euros a dolares "+cambioMoneda);
        
        
    }
    
}
