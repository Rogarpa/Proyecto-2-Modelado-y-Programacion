
public class MagiaVidente implements Magia{

    private Aldeano aVer;
    private Aldea aldeaHogar;
    private Aldeano usuario;

    /**
    *Constructor de la Clase.
    *@param aVer la victima de la cula la vidente va a ver la identidad.
    *@param aldeaSobreLaCualActuar la aldea a la que pertenece la victima
    */
    public MagiaVidente(Aldeano aVer,Aldea aldeaSobreLaCualActuar,Aldeano usuario){
        this.aVer=aVer;
        aldeaHogar=aldeaSobreLaCualActuar;
    }

    @Override
    public void actua(){
        aldeaHogar.matar(aVer,usuario);
    }
}
