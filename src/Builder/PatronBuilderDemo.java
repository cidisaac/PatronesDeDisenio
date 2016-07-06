package Builder;

/**
 * Created by isaac.cid on 06/07/2016.
 */

//Demo que utiliza el AlmuerzoBuilder para demostrar el patron
public class PatronBuilderDemo {

    public static void main(String[] args){

        AlmuerzoBuilder almuerzoBuilder = new AlmuerzoBuilder();

        Almuerzo vegMeal = almuerzoBuilder.prepareVegMeal();
        System.out.println("Comida Vegetariana:");
        vegMeal.showItems();
        System.out.println("Costo total: " + vegMeal.getCost());

        Almuerzo nonVegMeal = almuerzoBuilder.prepareNonVegMeal();
        System.out.println("Comida NO Vegetariana:");
        nonVegMeal.showItems();
        System.out.println("Costo total: " + nonVegMeal.getCost());
    }
}
