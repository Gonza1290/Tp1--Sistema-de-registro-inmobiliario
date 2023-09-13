
package paradigma.tp1;

import java.util.ArrayList;
import java.io.*;

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
    
    public void guardar() {
        try {
            FileOutputStream fileout = new FileOutputStream("escrituras");
            ObjectOutputStream salida = new ObjectOutputStream(fileout);
            salida.writeObject(escrituras);
            salida.close();
        }catch(FileNotFoundException e){// en caso de que el archive no se pueda crear
            e.printStackTrace();
        }catch(IOException e){// en caso de que ocurra otro error
            e.printStackTrace();
        }
    }
     public void recuperar() {
        try {
            FileInputStream fileIn = new FileInputStream("escrituras");
            ObjectInputStream entrada = new ObjectInputStream(fileIn);
            ArrayList<Escritura> Leido = (ArrayList<Escritura>)entrada.readObject();
            for(int i=0;i<Leido.size();i++){
           System.out.println(Leido.get(i));        
            }
            entrada.close();     
       }catch(FileNotFoundException e){
            e.printStackTrace();
       }catch(IOException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Registro{" + "coefAvaluoEdificio=" + coefAvaluoEdificio + ", municipio=" + municipio + ", tasas=" + tasas + '}';
    }
    
}
