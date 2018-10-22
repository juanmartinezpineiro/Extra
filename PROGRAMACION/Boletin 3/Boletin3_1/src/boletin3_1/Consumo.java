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
public class Consumo {
    private float km;
    private float litros;
    private float vMedia;
    private float pGas;
    
   //Constructores
   public Consumo (){
       
   }
   
   public Consumo(float km,float litros,float vMedia,float pGas, float e){
     this.km=km;
     this.litros=litros;
     this.vMedia=vMedia;
     this.pGas=pGas;
     
     
       
       
   }

    Consumo(int i, int i0, int i1, float f) {
        
    }
   //Metodos de acceso
   public void setKm(float km) {
        this.km = km;
    }

    public void setLitros(float litros) {
        this.litros = litros;
    }

    public void setvMedia(float vMedia) {
        this.vMedia = vMedia;
    }

    public void setpGas(float pGas) {
        this.pGas = pGas;
    }

    public float getTempo() {

        return (float) (this.km / vMedia);
    }

    public float getvMedia() {
        return (float) vMedia;
    }
   
 
   
    //METODOS DE CALCULO
    public float consumoMedio() {
     //litros por cada 100km
     
     return (float) (this.litros*(this.km/100));

    }

    public float consumoEuros() {
    //euros por cada 100km
   
     return this.pGas*litros*(this.km/100);

        
    }

}
  
  
   
   
   
  
   
   
   

