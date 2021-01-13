
public class Vidente extends Aldeano{

    private static Vidente uniqueinstanceof;
    private Aldeano identidad;

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
    *@param identidad el aldenao sobre el cual va a actuar su magia.
    */
    protected Vidente(Aldeano identidad){
        this.identidad=identidad;
        cabello="Desconocido, tapado por turbante.";
        arma="Ninguna, solo una bola de cristal.";
        ropa="Holzkary moderno, tradicional gitano.";
    }

    /**
    *Meotdo para que la vidente pueda usar su poder.
    */
    public Aldeano descubrirIdentidad(int id){
        return null;
    }


    @Override
    public Magia morir(){
        Magia magia=new MagiaVidente(this.identidad,this.getAldea());
        return magia;
    }
}
