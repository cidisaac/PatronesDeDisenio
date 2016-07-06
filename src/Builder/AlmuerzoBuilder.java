package Builder;

/**
 * Created by isaac.cid on 06/07/2016.
 */

//STEP 6
//Creamos la clase AlmuerzoBuilder, es la clase responsable de crear objetos de tipo Almuerzo
public class AlmuerzoBuilder {

    public Almuerzo prepareVegMeal(){
        Almuerzo almuerzo = new Almuerzo();
        almuerzo.addItem(new HamburguesaVegetariana());
        almuerzo.addItem(new Coca());

        return almuerzo;
    }

    public Almuerzo prepareNonVegMeal(){
        Almuerzo almuerzo = new Almuerzo();
        almuerzo.addItem(new HamburguesaDePollo());
        almuerzo.addItem(new Pepsi());

        return almuerzo;
    }
}
