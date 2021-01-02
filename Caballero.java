
public class Caballero extends Aldeano{

    private static Caballero uniqueinstanceof;

    /**
    *Metodo para obtener la unica instancia del Caballero.
    *@return la unica instancia.
    */
    public Caballero getinstance(){
        return this.uniqueinstanceof;
    }

    /**
    *Constructor de la clase.
    */
    private Caballero(){}

    /**
    *Metodo para que el caballero pueda usar su poder.
    */
    public void setRehen(){}

    @Override
    public void morir(){
        
    }
}
