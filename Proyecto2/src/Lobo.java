
public class Lobo extends Aldeano{


    /**
    *Contructor de la clase.
    */
    public Lobo(){
    }

    @Override
    public Lobo clone(){
        return new Lobo();
    }


    @Override
    public Magia morir(){
        return null;
    }

}
