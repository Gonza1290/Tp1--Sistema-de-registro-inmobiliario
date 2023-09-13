
package paradigma.tp1;

public class Departamento{
    /* Atributos */
    private byte piso;
    private char dpto;
    private int superficie;
    
    /* Constructor */

    public Departamento(byte piso, char dpto, int superficie) {
        this.piso = piso;
        this.dpto = dpto;
        this.superficie = superficie;
    }
    /* Metodos */

    public byte getPiso() {
        return piso;
    }

    public char getDpto() {
        return dpto;
    }

    public int getSuperficie() {
        return superficie;
    }

    @Override
    public String toString() {
        return "Departamento{" + "piso=" + piso + ", dpto=" + dpto + ", superficie=" + superficie + '}';
    }
    
    
    
}
