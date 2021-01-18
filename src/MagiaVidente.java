
public class MagiaVidente implements Magia{

    private Jugador aVer;
    private Aldea aldeaHogar;
    private Jugador usuario;

    /**
    *Constructor de la Clase.
    *@param aVer la victima de la cula la vidente va a ver la identidad.
    *@param aldeaSobreLaCualActuar la aldea a la que pertenece la victima
    */
    public MagiaVidente(Jugador aVer,Aldea aldeaSobreLaCualActuar,Jugador usuario){
        this.aVer=aVer;
        aldeaHogar=aldeaSobreLaCualActuar;
    }

    @Override
    public void actua(){
        aldeaHogar.matar(aVer,usuario);
    }
}
