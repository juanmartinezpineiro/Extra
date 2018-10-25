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
public class EjemploStatic {

 
    public static void main(String[] args) {
      //Crear objeto de tipo alumno, para introduccir datos en la clase
      Alumno alum1 = new Alumno("Juan",5f);
      //Llamar al metodo para mostrar
      alum1.amosar();
      Alumno alum2 = new Alumno("Pedro",6f);
      alum2.amosar();
      alum1.amosar();
      System.out.println("referencia: "+ Alumno.referencia);
    }
    
}
