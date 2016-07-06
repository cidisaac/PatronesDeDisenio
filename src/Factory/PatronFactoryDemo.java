package Factory;

/**
 * Created by isaac.cid on 06/07/2016.
 */
//Usamos la fabrica para obtener objetos de una clase contreta pasandole informacion acerca del tipo.

public class PatronFactoryDemo {
    public static void main(String[] args){

        //Creo la fabrica de formas
        FormaFactory fabricaDeFormas = new FormaFactory();

        //creo una forma nueva, en este caso un circulo
        Forma forma1 = fabricaDeFormas.getForma("CIRCULO");

        //llamo al metodo dibujar del circulo.
        forma1.dibujar();

        //creo una forma nueva, en este caso un cuadrado
        Forma forma2 = fabricaDeFormas.getForma("CUADRADO");

        //llamo al metodo dibujar del cuadrado.
        forma2.dibujar();

        //creo una forma nueva, en este caso un rectangulo
        Forma forma3 = fabricaDeFormas.getForma("RECTANGULO");

        //llamo al metodo dibujar del rectangulo.
        forma3.dibujar();

    }
}
