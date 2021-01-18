
public class MagiaAngel implements Magia{

    private Jugador aDormir;
    private Aldea aldeaHogar;
    private Jugador usuario;

    /**
    *Constructor de la Clase.
    *@param aDormir el hombre-lobo victima a matar.
    *@param aldeaSobreLaCualActuar la aldea a la que pertenece el hombre-lobo.
    */
    public MagiaAngel(Jugador aDormir,Aldea aldeaSobreLaCualActuar,Jugador usuario){
        this.aDormir=aDormir;
        aldeaHogar=aldeaSobreLaCualActuar;
        this.usuario=usuario;
    }

    @Override
    public void actua(){
        aldeaHogar.matar(aDormir,usuario);
    }
}
