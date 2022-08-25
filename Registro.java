
package paradigma.tp1;

import java.util.ArrayList;

public class Registro {
  /* Atributos */
    private float coefAvaluoEdificio;
    private String municipio;
    private float tasas;
    private ArrayList<Lote> inmuebles = new ArrayList<>();
    private ArrayList<Escritura> escrituras = new ArrayList<>();
  /* Constructor */
    public Registro(float coefAvaluoEdificio,String municipio,float tasas){
        this.coefAvaluoEdificio= coefAvaluoEdificio;
        this.municipio = municipio;
        this.tasas = tasas;
    }
   /* Metodos */
    public float valuar(Lote lote){
        return lote.valuar();
    }
    public void registrar(Lote lote){
        inmuebles.add(lote);
        Escritura escritura = new Escritura();
        escritura.setDomicilio(lote.getDomicilio());
        escritura.setSuperficie(lote.getSuperficie());
        escrituras.add(escritura);
        lote.setInscripto(this);
    }
    public void emitirBoletos(){
        for(int i=0;i<inmuebles.size();i++){
           System.out.println(inmuebles.get(i));        
        }
    }
    public float getTasa(){
        return tasas;
    }
    public void setTasa(float tasas){
        this.tasas=tasas;
    }
    public float getCoefAvaluoEdificio(){
        return coefAvaluoEdificio;
    }
    public void setCoefAvaluoEdificio(float coefAvaluoEdificio){
        this.coefAvaluoEdificio=coefAvaluoEdificio;
    }

    @Override
    public String toString() {
        return "Registro{" + "coefAvaluoEdificio=" + coefAvaluoEdificio + ", municipio=" + municipio + ", tasas=" + tasas + '}';
    }
    
}
