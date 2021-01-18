

public class Vidente extends Aldeano{

    private static Vidente uniqueinstanceof;
    private static Jugador identidad;

    /**
    *Metodo para obtener la unica instancia de la clase.
    *@return la instancia.
    */
    public static Vidente getinstance(Jugador identidad){
        uniqueinstanceof=new Vidente(identidad);
        return uniqueinstanceof;
    }

    /**
    *El constructor de la clase.
    *@param identidad el aldenao sobre el cual va a actuar su magia.
    */
    protected Vidente(Jugador identidad){
        this.identidad=identidad;
    }

    /**
    *Meotdo para que la vidente pueda usar su poder.
    *@param id el id del aldeano sobre el que va a actuar.
    */
    public Aldeano descubrirIdentidad(int id){
        return null;
    }


    public void setIdentidad(Jugador identidad){
        this.identidad = identidad;
    }

    @Override
    public Magia morir(){
        Magia magia=new MagiaVidente(this.identidad,this.getAldea(),this);
        return magia;
    }
}
