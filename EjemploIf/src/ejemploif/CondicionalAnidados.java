package ejemploif;

import javax.swing.JOptionPane;

/**
 *
 * @author jmartinezpineiro
 */
public class CondicionalAnidados {
   
    public void avaliarConAnidados(){
        int num1,num2;
        String numero1 = JOptionPane.showInputDialog("Teclea numero1: ");
            num1=Integer.parseInt(numero1);
            num2 = Integer.parseInt(JOptionPane.showInputDialog("numero2: "));
            if(num1>num2)
                System.out.println(num1 +"e maior");
//                else{
//                if(num1<num2)
//                    System.out.println(num1 + "e menor");
//                else
//                    System.out.println("Son iguais");
//                        
//                        }

            //tamen se pode facer :
            else if(num1<num2)
                System.out.println(num1+"e menor");
            else
                JOptionPane.showMessageDialog(null,"Son iguales");
    }
}
