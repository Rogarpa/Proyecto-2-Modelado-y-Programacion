
public class MagiaVidente implements Magia{

    private Jugador aVer;

    /**
    *Constructor de la Clase.
    *@param aVer la victima de la cula la vidente va a ver la identidad.
    *@param aldeaSobreLaCualActuar la aldea a la que pertenece la victima
    */
    public MagiaVidente(Jugador aVer,Aldea aldeaSobreLaCualActuar){
        this.aVer=aVer;
    }

    @Override
    public void actua(){

    }
}
