public class MagiaCaballero implements Magia{

    private Jugador sacrificar;

    /**
    *Constructor de la clase.
    *@param sacrificar la victima del caballero.
    *@param aldeaSobreLaCualActuar la aldea a la que pertenece la victima.
    */
    public MagiaCaballero(Jugador sacrificar,Aldea aldeaSobreLaCualActuar){
        this.sacrificar=sacrificar;
    }

    @Override
    public void actua(){
        
    }
}
