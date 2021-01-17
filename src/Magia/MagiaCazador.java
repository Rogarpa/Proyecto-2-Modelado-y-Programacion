
public class MagiaCazador implements Magia{

    private Aldeano aDisparar;
    private Aldea aldeaHogar;
    private Aldeano usuario;

    /**
    *Constructor de la clase.
    *@param aDisparar la victima a disparar.
    *@param aldeaSobreLaCualActuar la aldea a la que pertenece la victima.
    */
    public MagiaCazador(Aldeano aDisparar,Aldea aldeaSobreLaCualActuar,Aldeano usuario){
        this.aDisparar=aDisparar;
        aldeaHogar=aldeaSobreLaCualActuar;
        this.usuario=usuario;
    }

    @Override
    public void actua(){
        aldeaHogar.matar(aDisparar,usuario);
    }
}
