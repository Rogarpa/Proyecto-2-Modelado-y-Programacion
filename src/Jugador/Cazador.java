
public class Cazador extends Aldeano{

    private static Cazador uniqueinstanceof;
    private static Jugador esbirro;

    /**
    *Metodo para obtener la unica instancia de la clase.
    *@return la instancia.
    */
    public static Cazador getinstance(Aldeano esbirro){
        uniqueinstanceof=new Cazador(esbirro);
        return uniqueinstanceof;
    }

    /**
    *Constructor de la clase.
    *@param esbirro el aldeano sobre el cual va a actuar su magia.
    */
    protected Cazador(Aldeano esbirro){
        this.esbirro=esbirro;
    }

    /**
    *Metodo para que el cazador pueda saber sobre quien usar su poder.
    *@param esbirro el aldeano sobre el que va a actuar.
    */
    public void setEsbirro(Jugador esbirro){
        this.esbirro=esbirro;
    }

    /**
    *Metodo para obtener el rehen.
    *@return el rehen.
    */
    public Jugador getEsbirro(){
        return this.esbirro;
    }

    @Override
    public Magia morir(){
        Magia magia=new MagiaCazador(this.esbirro,this.getAldea(),this);
        return magia;
    }

}
