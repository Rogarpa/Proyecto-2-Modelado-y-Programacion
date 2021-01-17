
public class BuilderCaballero implements BuilderJugador{

    public Caballero personajeAConstruir;

    public Caballero(){
        personajeAConstruir = new Caballero(null);
    }

    @Override
    public void setCabello(String cabello){
        personajeAConstruir.cabello=cabello;
    }

    @Override
    public void setArma(String arma){
        personajeAConstruir.arma=arma;
    }

    @Override
    public void setRopa(String ropa){
        personajeAConstruir.ropa=ropa;
    }

    @Override
    public void setAldea(Aldea aldea){
        personajeAConstruir.aldea=aldea;
    }

    @Override
    public void setId(int id){
        personajeAConstruir.setId(id);
    }

    @Override
    public void setNickname(String nickname){
        personajeAConstruir.setNickname(nickname);
    }

    /**
    *Metodo para obtener el Caballero a construir.
    *@return el Caballero.
    */
    public Caballero getPersonaje(){
        return this.personajeAConstruir;
    }

    @Override
    public default setRelacion(Jugador relacionad){
        personajeAConstruir.setRehen(relacionado);
    }
}
