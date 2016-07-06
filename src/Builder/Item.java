package Builder;

/**
 * Created by isaac.cid on 06/07/2016.
 */

//STEP 1
//Interfaz que representa el item
public interface Item {

    public String name();
    public Empaquetado packing();
    public float price();
}
