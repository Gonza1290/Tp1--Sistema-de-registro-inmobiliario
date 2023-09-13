
package paradigma.tp1;

public class Casa extends Edificio{
    /* Atributos */
    private boolean plantaAlta;
    private int superficie;
    
    /* Constructor */

    public Casa(float avaluoXmtr,boolean plantaAlta, int superficie) {
        super(avaluoXmtr);
        this.plantaAlta = plantaAlta;
        this.superficie = superficie;
    }
    /* Metodos */

    public boolean getPlantaAlta() {
        return plantaAlta;
    }

    public int getSuperficie() {
        return superficie;
    }
    @Override
    public float valuar(){
        return avaluoXmtr * superficie;
    }
}
