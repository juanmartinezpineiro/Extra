/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplostatic;

/**
 *
 * @author jmartinezpineiro
 */
public class Alumno {
    //variables instancia, propias de los objetos
    private String nombre;
    private float nota;
    private int numReferencia; //para que no se repita el valor de referencia al consultar
    public static int referencia = 6220; //variable de clase común a todos los objetos
    
    public Alumno(){
        //constructor por defecto, aqui se establece la funcionalidad de static referencia
        numReferencia = ++ referencia ; //asi no en caso de mantenerlo
        
    }
    //constructor parametrizado dar los valores a los private
    public Alumno (String nombre, float nota ){ //no establecer el static, en caso de this. si
        this.nombre=nombre;
        this.nota=nota;
//        this.numReferencia=refe;
       numReferencia = ++ referencia ;
    }
    //Hacer get y set
//    public void setNumreferencia(int refe){
//        numReferencia = refe;
//    }
//    public int getNumReferencia (){
//        return numReferencia;
//    }
    
    //En caso de que la variable sea static
    
    //Enseñar todas las caracteristas, visualizar
    public void amosar (){
        System.out.println("Nombre: "+nombre + " nota: "+nota+ " referencia:  "+numReferencia);
    }
    
}
