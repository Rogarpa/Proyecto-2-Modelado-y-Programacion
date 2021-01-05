public interface Jugador{

    /**
    *Metodo para obtener el Id
    *@return el id.
    */
    public int getId();

    /**
    *Metodo que obtiene la aldea a la que pertenece el Aldeano.
    *@return la aldea.
    */
    public Aldea getAldea();

    /**
    *Metodo para obtener el nombre del Aldeano.
    *@return el nombre.
    */
    public String getNickname();

    /**
    *Metodo para cuando un personaje muera.
    */
    public void morir();
}
