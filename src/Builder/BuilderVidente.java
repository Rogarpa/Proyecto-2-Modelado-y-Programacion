
public class BuilderVidente implements BuilderJugador{

    public Vidente personajeAConstruir;


    public BuilderVidente(){
        personajeAConstruir = new Vidente(null);
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
    *Metodo para obtener el Vidente a construir.
    *@return el Vidente.
    */
    public Vidente getPersonaje(){
        return this.personajeAConstruir;
    }

    @Override
    public void setRelacion(Jugador relacionado){
        personajeAConstruir.setIdentidad(relacionado);
    }
}
