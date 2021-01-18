
public class MagiaCaballero implements Magia{

    private Jugador sacrificar;
    private Aldea aldeaHogar;
    private Jugador usuario;

    /**
    *Constructor de la clase.
    *@param sacrificar la victima del caballero.
    *@param aldeaSobreLaCualActuar la aldea a la que pertenece la victima.
    */
    public MagiaCaballero(Jugador sacrificar,Aldea aldeaSobreLaCualActuar,Jugador usuario){
        this.sacrificar=sacrificar;
        aldeaHogar=aldeaSobreLaCualActuar;
        this.usuario=usuario;
    }

    @Override
    public void actua(){
        aldeaHogar.matar(sacrificar,usuario);
    }
}
