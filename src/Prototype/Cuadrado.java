package Prototype;

/**
 * Created by isaac.cid on 07/07/2016.
 */

//Creamos la clase concreta extendiendo de la clase Forma
public class Cuadrado extends Forma{

    public Cuadrado(){
        type = "Cuadrado";
    }

    @Override
    void dibujar() {
        System.out.println("Dentro del cuadrado:: metodo dibujar !");
    }
}
