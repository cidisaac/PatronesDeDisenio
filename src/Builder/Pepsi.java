package Builder;

/**
 * Created by isaac.cid on 06/07/2016.
 */

//STEP 4
//Creamos la extension de la clase BebidaFria
public class Pepsi extends BebidaFria {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
