package Prototype;

/**
 * Created by isaac.cid on 07/07/2016.
 */

//Creamos la clase concreta extendiendo de la clase Forma
public class Rectangulo  extends Forma{

    public Rectangulo(){
        type = "Rectangulo";
    }

    @Override
    void dibujar() {
        System.out.println("Dentro del rectangulo:: metodo dibujar !");
    }
}
