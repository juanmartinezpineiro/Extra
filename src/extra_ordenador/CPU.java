package extra_ordenador;

/**
 *
 * @author jmartinezpineiro
 */
public class CPU {
    private int nucleos;
    private int ram;

    public CPU() {
    }

    public CPU(int nucleos, int ram) {
        this.nucleos = nucleos;
        this.ram = ram;
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
    
    

}
