package extra_ordenador;

/**
 *
 * @author jmartinezpineiro
 */
public class Monitor {
    
    private String marca;
    private float pulgadas;

    public Monitor(String marca, float pulgadas) {
        this.marca = marca;
        this.pulgadas = pulgadas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }
    
    

}
