public class AldeanoComun extends Aldeano{

    /**
    *Metodo para crear hombres lobos con prototype.
    *@return un prototype de lobo.
    */
    public AldeanoComun clone(){
        return new AldeanoComun();
    }

    @Override
    public Magia morir(){
        return null;
    }

    /**
    *Constructor de la clase.
    */
    public AldeanoComun(){
    }
}
