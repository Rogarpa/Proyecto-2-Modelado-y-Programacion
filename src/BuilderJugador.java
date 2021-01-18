
public interface BuilderJugador{

    /**
    *Metodo para poner el cabello al aldeano.
    *@param cabello el cabello.
    */
    public void setCabello(String cabello);

    /**
    *Metodo para ponerle el arma al aldeano.
    *@param arma el arma.
    */
    public void setArma(String arma);

    /**
    *Metodo para ponerle ropa al aldeano.
    *@param ropa la ropa.
    */
    public void  setRopa(String ropa);

    /**
    *Metodo para ponerle una aldea al aldeano.
    @param aldea la aldea.
    */
    public void setAldea(Aldea aldea);

    /**
    *Metodo para definir el id de un Aldeano.
    *@param id el id que queremos poner.
    */
    public void setId(int id);

    /**
    *Metodo para definir el nombre al Aldeano.
    *@param nickname el nombre.
    */
    public void setNickname(String nickname);

    /**
    *Metodo para definir relaciones entre Aldeanos.
    *@param relacionado el aldeano a relacionar.
    */
    public default void setRelacion(Jugador relacionado){}

}
