
public class MagiaCaballero implements Magia{

    private Aldeano sacrificar;
    private Aldea aldeaHogar;
    private Aldeano usuario;

    /**
    *Constructor de la clase.
    *@param sacrificar la victima del caballero.
    *@param aldeaSobreLaCualActuar la aldea a la que pertenece la victima.
    */
    public MagiaCaballero(Aldeano sacrificar,Aldea aldeaSobreLaCualActuar,Aldeano usuario){
        this.sacrificar=sacrificar;
        aldeaHogar=aldeaSobreLaCualActuar;
        this.usuario=usuario;
    }

    @Override
    public void actua(){
        aldeaHogar.matar(sacrificar,usuario);
    }
}
