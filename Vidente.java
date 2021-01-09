
public class Vidente extends Aldeano{

    private static Vidente uniqueinstanceof;

    /**
    *Metodo para obtener la unica instancia de la clase.
    *@return la instancia.
    */
    public static Vidente getinstance(){
        uniqueinstanceof=new Vidente();
        return uniqueinstanceof;
    }

    /**
    *El constructor de la clase.
    */
    protected Vidente(){
        cabello="Desconocido, tapado por turbante.";
        arma="Ninguna, solo una bola de cristal.";
        ropa="Holzkary moderno, tradicional gitano.";
    }

    /**
    *Meotdo para que la vidente pueda usar su poder.
    */
    public void descubriridentidad(int id){}

    @Override
    public Magia morir(){
        return null;
    }
}
