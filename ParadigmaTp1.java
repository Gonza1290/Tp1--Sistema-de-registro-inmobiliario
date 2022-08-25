
package paradigma.tp1;

public class ParadigmaTp1 {
    
    public static void main(String[] args) {
        Registro registro = new Registro(157,"Guaymallen",15);
        Lote lote1 = new Lote(10,"Urquiza",10,200);
        Lote lote2 = new Lote(20,"San Martin",50,300);
        registro.registrar(lote1);
        registro.registrar(lote2);
       
        System.out.println("El registro del lote 1 es: "+lote1.getInscripto());
        System.out.println("El valuo del lote 1 es: "+ registro.valuar(lote1));
        System.out.println("El registro del lote 2 es: "+lote2.getInscripto());
        System.out.println("El valuo del lote 2 es: "+ registro.valuar(lote2));
        System.out.println("Datos de Lotes registrados: ");
        registro.emitirBoletos();
        
    }
}
    
