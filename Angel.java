
public class Angel implements Angelical{

    private static Angel uniqueinstanceof;

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
    private Angel(){}

    /**
    *Meotdo para que la vidente pueda usar su poder.
    */
    public void mefui(){}
}
