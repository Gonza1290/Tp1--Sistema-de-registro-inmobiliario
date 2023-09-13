
package paradigma.tp1;

import java.util.ArrayList;

public class PH extends Edificio{
    /* Atributos */
    private byte cantPisos;
    private ArrayList<Departamento> Departamentos;
    
    /* Constructor */

    public PH(float avaluoXmtr,byte cantPisos) {
        super(avaluoXmtr);
        this.cantPisos = cantPisos;
        this.Departamentos = new ArrayList<Departamento>();
    }
    /* Metodos */

    public byte getCantPisos() {
        return cantPisos;
    }
    
     @Override
    public float valuar(){
        return avaluoXmtr * cantPisos;
    }
    
}
