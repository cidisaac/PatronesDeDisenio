package Builder;

/**
 * Created by isaac.cid on 06/07/2016.
 */

//STEP 3
// Creamos las implementaciones abstractas de clases de la interfaz item que proveen las funcionalidades por default
public abstract class Hamburguesa implements Item{

    @Override
    public Empaquetado packing(){
        return new PapelEnvoltorio();
    }

    @Override
    public abstract float price();
}
