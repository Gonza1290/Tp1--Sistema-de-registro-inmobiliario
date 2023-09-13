
package paradigma.tp1;

public abstract class Edificio {
    /* Atributos */
    protected float avaluoXmtr;
    
    /* Constructor */

    public Edificio(float avaluoXmtr) {
        this.avaluoXmtr = avaluoXmtr;
    }
   
    
    /* Metodos */
    public abstract float valuar();

    public void setAvaluoXmtr(float avaluoXmtr) {
        this.avaluoXmtr = avaluoXmtr;
    }
    
    public float getAvaluo(){
         return avaluoXmtr;
    }
    public Edificio demoler(){
        return null;
    }
    
    @Override
    public String toString() {
        return "Edificio{" + "avaluoXmtr=" + avaluoXmtr + '}';
    }
}
