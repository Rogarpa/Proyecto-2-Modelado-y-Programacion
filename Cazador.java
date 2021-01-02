
public class Cazador extends Aldeano{

    private static Cazador uniqueinstanceof;

    /**
    *Metodo para obtener la unica instancia de la clase.
    *@return la instancia.
    */
    public Cazador getinstance(){
        return this.uniqueinstanceof;
    }

    /**
    *Constructor de la clase.
    */
    private Cazador(){}

    /**
    *Metodo para que el cazador pueda usar su poder.
    */
    public void setEsbirro(){}

    @Override
    public void morir(){}
}
