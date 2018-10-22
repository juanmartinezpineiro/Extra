/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3_1;

/**
 *
 * @author jmartinezpineiro
 */
public class Boletin3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // a)Crear un objeto, con el constructor por defecto
        Consumo consumo1= new Consumo();
        
        //b)Dar valor a litros y a gasolina
        consumo1.setLitros(50);
        consumo1.setpGas((float) 1.57);
        
        //c)Crear objeto tipo consumo, utilizando el constructor con todos los parametros
        
        Consumo consumo2= new Consumo(75, 25, 100, (float) 1.40);
        
        //d)A traves del segundo consumo, mostrar el consumo medio
        
        System.out.println("Consumo medio del viaje 2 es "+consumo2.consumoMedio());
        
        //e)El valor de los litros varia
        
         consumo2.setLitros(50);
         
         //f)Visualizar el objeto nº2
         
         System.out.println("la velocidad media del viaje 2 es "+consumo2.getvMedia());
    }
    
}
