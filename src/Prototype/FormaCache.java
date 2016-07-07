package Prototype;

import java.util.Hashtable;

/**
 * Created by isaac.cid on 07/07/2016.
 */

//Creamos una clase para obtener las clases concretas(circulo, rectangulo, cuadrado) de la base de datos y guardamos en una TABLA HASH
public class FormaCache {

    private static Hashtable<String, Forma> formaMap = new Hashtable<>();

    public static Forma getForma(String formaId){
        Forma formaCacheada = formaMap.get(formaId);
        return (Forma) formaCacheada.clone();
    }

    //Por cada forma se corre una consulta en la base de datos y se crea una forma
    //formaMap.put(formaKey, forma);
    //por ejemplo, vamos a agregar 3 formas

    public static void cargarCache(){
        Circulo circle = new Circulo();
        circle.setId("1");
        formaMap.put(circle.getId(),circle);

        Cuadrado square = new Cuadrado();
        square.setId("2");
        formaMap.put(square.getId(),square);

        Rectangulo rectangle = new Rectangulo();
        rectangle.setId("3");
        formaMap.put(rectangle.getId(), rectangle);
    }
}
