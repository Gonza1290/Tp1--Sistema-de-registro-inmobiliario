
package paradigma.tp1;

import java.io.Serializable;

public class Escritura implements Serializable {
  /* Atributos */
  private Integer numero;
  private int superficie;
  private String domicilio;
  
  /* Constructor */
  public void Escritura(){
}
    /* Metodos */
    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "Escritura{" + "numero=" + numero + ", superficie=" + superficie + ", domicilio=" + domicilio + '}';
    }

}