
package paradigma.tp1;


public class Lote {
    /* Atributos */
    private int idPatron;
    private String domicilio;
    private int avaluoxmt;
    private int superficie;
    private Registro inscripto;
    private Edificio construccion;
    
     /* Constructor */
    public Lote(int idPatron,String domicilio,int avaluoxmtr,int superficie){
        this.idPatron= idPatron;
        this.domicilio= domicilio;
        this.avaluoxmt= avaluoxmtr;
        this.superficie= superficie;
    }
     /* Metodos */
    public float valuar (){
        return avaluoxmt*superficie;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setInscripto(Registro inscripto) {
        this.inscripto = inscripto;
    }

    public Registro getInscripto() {
        return inscripto;
    }

    @Override
    public String toString() {
        return "Lote{" + "idPatron=" + idPatron + ", domicilio=" + domicilio + ", avaluoxmt=" + avaluoxmt + ", superficie=" + superficie +  ", construccion=" + construccion + '}';
    }
    
}
