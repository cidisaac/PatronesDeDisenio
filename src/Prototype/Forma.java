package Prototype;

/**
 * Created by isaac.cid on 07/07/2016.
 */

//Creamos una clase abstracta implementando la interfaz Cloneable
public abstract class Forma implements Cloneable{

    private String id;
    protected String type;

    abstract void dibujar();

    public String getType(){
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object clone(){
        Object clone = null;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        return clone;
    }
}
