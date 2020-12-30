
public class Vidente extends Aldeano{

    private static Vidente uniqueinstanceof;

    /**
    *Metodo para obtener la unica instancia de la clase.
    *@return la instancia.
    */
    public Vidente getinstance(){
        return this.uniqueinstanceof;
    }

    /**
    *El constructor de la clase.
    */
    private Vidente(){}

    /**
    *Meotdo para que la vidente pueda usar su poder.
    */
    public void descubriridentidad(int id){}
}
