package Singleton;

/**
 * Created by isaac.cid on 06/07/2016.
 */
public class SingleObject {

    //creamos un objeto de tipo SingleObject
    private static SingleObject instance = new SingleObject();

    //hacemos el constructor privado entonces esta clase no pude ser instanciada
    private SingleObject(){
    }

    //Hacemos el get del unico objeto disponible
    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hola mundo desde un singleton !");
    }
}
