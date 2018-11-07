package ejercicionotas;

import javax.swing.JOptionPane;
import jdk.nashorn.internal.ir.WhileNode;

/**
 *
 * @author jmartinezpineiro
 */
//Calcular la teoria (40%),practica(40%) y boletin (20%)
public class Media {

    private double notaTeoria;
    private double notaPractico;
    private double notaBoletin;
    

  
    public int pedirNumeroExamenes(){
        int nEx = 0; //variable numero examenes
        nEx = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de examenes:"));
        return nEx;
    }
   

     public double pedirNota(){
        
        double res;
        do{
        res = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la nota : "));
        
        
    }while(res <1 || res >10);  
//        JOptionPane.showMessageDialog(null, "Nota invalida");
        return res;
           
    }
     public void mediaTeoria(){
         int cont;
         int nExamenes;
         double suma = 0;
         double nota;
         
       
        nExamenes = pedirNumeroExamenes();
        for (cont = 0; cont < nExamenes ; cont ++ ){
             nota = pedirNota();
             suma = suma + nota;
        }
        
        notaTeoria = suma / nExamenes * (40 / 100);
        JOptionPane.showMessageDialog(null, "Tu nota media de la teoria es: "+notaTeoria);
       }
     
     
     public void mediaPractico(){
         int cont;
         int nExamenes;
         double suma = 0;
         double nota;
         
      nExamenes = pedirNumeroExamenes();
      for (cont = 0; cont < nExamenes ; cont++){
          nota = pedirNota();
      }
      notaPractico = suma / nExamenes * (40 /100);
         JOptionPane.showMessageDialog(null, "Tu nota media de la practica : "+notaPractico);
         
     }
     
     public void mediaBoletin(){
         int cont;
         int nExamenes;
         double suma = 0;
         double nota;
         int porcentajeBoletines;
         
      nExamenes = pedirNumeroExamenes();
      porcentajeBoletines = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el porcentaje de boletines hechos: "));
         if (porcentaje) {
             
         }
      notaBoletin = suma / nExamenes * (20 /100);
         JOptionPane.showMessageDialog(null, "Tu nota media de los boletines : "+notaBoletin);
         
     }
     
     public void notaFinal(){
         JOptionPane.showMessageDialog(null, "La nota final es: "+(notaBoletin+notaPractico+notaTeoria));
     }
     
     
     
     
     
}
    
    


