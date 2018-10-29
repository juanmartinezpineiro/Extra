package ejemploif;

import java.util.Scanner;

/**
 *
 * @author jmartinezpineiro
 */
public class CondicionalDobre {
    Scanner res = new Scanner (System.in);
    public void maiorMenorEdade(){
       
        System.out.println("Teclea edad: ");
        int edade = res.nextInt();
        if (edade<18){
            System.out.println(" es menor de edad");
        }
        else{
            System.out.println("Es mayor de edad");
        }
        System.out.println("***remata el programa***");
    }
    
    public void maioMenor(){
          System.out.println("Teclea edad: ");
        int ed = res.nextInt();
        String resposta;
        if (ed<18){
          resposta = "e menor de edade";
        }
        else{
          resposta = "Maior de edade";
        }
        System.out.println(resposta);
        System.out.println("***remata el programa***");
    }
    
    public void maiorMenorOperador(){
        System.out.println("Teclea edade: ");
        int ed = res.nextInt();
        String resposta;
        resposta= (ed<18) ? "e menor":"e maior";
        System.out.println(resposta);
        System.out.println("remata");
    }
}
