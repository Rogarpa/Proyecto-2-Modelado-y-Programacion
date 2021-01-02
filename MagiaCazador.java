
public class MagiaCazador implements Magia{

    private Jugador aDisparar;

    /**
    *Constructor de la clase.
    *@param aDisparar la victima a disparar.
    *@param aldeaSobreLaCualActuar la aldea a la que pertenece la victima.
    */
    public MagiaCazador(Jugador aDisparar,Aldea aldeaSobreLaCualActuar){
        this.aDisparar=aDisparar;
    }

    @Override
    public void actua(){
        
    }
}
