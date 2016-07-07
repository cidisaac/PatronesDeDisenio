package Prototype;

/**
 * Created by isaac.cid on 07/07/2016.
 */

//Creamos la clase concreta extendiendo de la clase Forma
public class Circulo extends Forma {

    public Circulo(){
        type = "Circulo";
    }

    @Override
    void dibujar() {
        System.out.println("Dentro del circulo:: metodo dibujar !");
    }
}
