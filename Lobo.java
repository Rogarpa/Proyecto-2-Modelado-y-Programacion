
public class Lobo extends Aldeano{


    /**
    *Contructor de la clase.
    */
    public Lobo(){
        arma="Colmillos y Garras";
        ropa="Pelaje.";
        cabello="Pelaje";
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
