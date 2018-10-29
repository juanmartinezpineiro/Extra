package ejemploif;

import java.util.Scanner;

/**
 *
 * @author jmartinezpineiro
 */
public class CondicionalSimple {
    public void maiorEdade (){
        Scanner leer = new Scanner (System.in);
        System.out.println("Teclea edade ");
        int edade = leer.nextInt();
        if(edade <18 ){
            System.out.println("E menor de edade");
        }
        System.out.println("Remata o programa");
    }
}
