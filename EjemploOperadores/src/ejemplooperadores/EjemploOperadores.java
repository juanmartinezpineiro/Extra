/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplooperadores;

/**
 *
 * @author jmartinezpineiro
 */
public class EjemploOperadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1=0,num2= 4;
        System.out.println("num1 = "+num1 +" \nnum2 = "+num2);
        num1=num2++;
        System.out.println ("num1 = "+num1 +" \nnum2 = "+num2);
//        (num1=num2++) mostramos num 1 con el valor de num2 y num2 aumentando un valor
    num1 =++num2;
        System.out.println ("(num1=++num2)"+num1 + "num1 " + "n\num2" +num2);
        
        num1=3; num2=4;
        int suma;
        suma=num1+num2;
        System.out.println("suma = "+suma);
        //Tambien se puede hacer de otra manera, poner todo directamente en el println
        System.out.println("suma = "+ (num1+num2));
        
        //Casting o casteo
        int entero = 6;
        float decimal = 2.3f; //forzar conversion a double esto es casting
        //Conversion automatica
        decimal = entero;
        System.out.println(decimal); //conversion automatica
        //Casting un entero le paso un decimal
        entero = (int) decimal; //de mayor a menor precision hay que hacer cast = forzar
        System.out.println(entero);
        
        
        // TODO code application logic here
    }
    
}
