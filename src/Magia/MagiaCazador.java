
public class MagiaCazador implements Magia{

    private Jugador aDisparar;
    private Aldea aldeaHogar;
    private Jugador usuario;

    /**
    *Constructor de la clase.
    *@param aDisparar la victima a disparar.
    *@param aldeaSobreLaCualActuar la aldea a la que pertenece la victima.
    */
    public MagiaCazador(Jugador aDisparar,Aldea aldeaSobreLaCualActuar,Jugador usuario){
        this.aDisparar=aDisparar;
        aldeaHogar=aldeaSobreLaCualActuar;
        this.usuario=usuario;
    }

    @Override
    public void actua(){
        aldeaHogar.matar(aDisparar,usuario);
    }
}
