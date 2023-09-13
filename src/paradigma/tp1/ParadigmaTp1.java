
package paradigma.tp1;

public class ParadigmaTp1 {
    
    public static void main(String[] args) {
        Registro registro = new Registro(157,"Guaymallen",15);
        Lote lote01 = new Lote(10,"Urquiza",10.1f,200);
        Lote lote02 = new Lote(20,"San Martin",13.12f,300);
        registro.registrar(lote01);
        registro.registrar(lote02);
        System.out.println("El lote 1 esta registrado en: "+lote01.getInscripto());
        System.out.println("El valuo del lote 1 es: "+ registro.valuar(lote01));
        System.out.println("El lote 2 esta registrado en: "+lote02.getInscripto());
        System.out.println("El valuo del lote 2 es: "+ registro.valuar(lote02));
        Edificio construccion01 = new Casa(15.21f,Boolean.FALSE,160);
        Edificio construccion02 = new PH(12.51F,(byte)2);
        try{
        lote01.setConstruccion(construccion01);
        lote02.setConstruccion(construccion02);
        lote02.setConstruccion(construccion01);
        }catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Datos de Lotes registrados: ");
        registro.emitirBoletos();
        
        System.out.println("Guardando Escrituras");
        registro.guardar();
        System.out.println("Recuperando Escrituras guardadas");
        registro.recuperar();
    }
}
    
