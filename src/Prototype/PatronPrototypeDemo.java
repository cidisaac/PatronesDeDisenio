package Prototype;

/**
 * Created by isaac.cid on 07/07/2016.
 */

//PatronPrototypeDemo usa la clase FormaCache para obtener clones de las formas guardadas en la TABLA HASH
public class PatronPrototypeDemo {

    public static void main(String[] args){
        FormaCache.cargarCache();

        Forma formaClonada = FormaCache.getForma("1");
        System.out.println("Forma 1: " + formaClonada.getType());

        Forma formaClonada2 = FormaCache.getForma("2");
        System.out.println("Forma 2: " + formaClonada2.getType());

        Forma formaClonada3 = FormaCache.getForma("3");
        System.out.println("Forma 3: " + formaClonada3.getType());
    }
}
