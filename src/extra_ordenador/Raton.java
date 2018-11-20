package extra_ordenador;

/**
 *
 * @author jmartinezpineiro
 */
public class Raton {

    private boolean inhalambrico;
    private String modelo;

    public Raton(boolean inhalambrico, String modelo) {
        this.inhalambrico = inhalambrico;
        this.modelo = modelo;
    }

    public boolean isInhalambrico() {
        return inhalambrico;
    }

    public void setInhalambrico(boolean inhalambrico) {
        this.inhalambrico = inhalambrico;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
