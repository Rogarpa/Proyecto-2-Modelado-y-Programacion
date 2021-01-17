public interface Jugador{

    /**
    *Metodo para obtener el Id
    *@return el id.
    */
    public int getId();

    /**
    *Metodo que obtiene la aldea a la que pertenece el Jugador.
    *@return la aldea.
    */
    public Aldea getAldea();

    /**
    *Metodo para obtener el nombre del Jugador.
    *@return el nombre.
    */
    public String getNickname();

    /**
    *Metodo para cuando un personaje muera.
    */
    public Magia morir();

    /**
    *Metodo para obtener una descripción del Jugador
    *@return la descripción
    */
    public String getDescripcion();
}
