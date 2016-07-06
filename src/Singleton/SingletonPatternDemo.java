package Singleton;

/**
 * Created by isaac.cid on 06/07/2016.
 */
public class SingletonPatternDemo {

    public static void main(String[] args){

        //no se pude hacer un new de la clase

        //Hacemos el get del unico objeto disponible
        SingleObject object = SingleObject.getInstance();

        //Mostramos el mensaje
        object.showMessage();
    }
}
