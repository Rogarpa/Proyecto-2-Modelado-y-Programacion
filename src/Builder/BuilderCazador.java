
public class BuilderCazador implements BuilderJugador{

    public Cazador personajeAConstruir;

    public BuilderCazador(){
        personajeAConstruir = new Cazador(null);
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
    *Metodo para obtener el Cazador a construir.
    *@return el Cazador.
    */
    public Cazador getPersonaje(){
        return this.personajeAConstruir;
    }

    @Override
    public void setRelacion(Jugador relacionado){
        personajeAConstruir.setEsbirro(relacionado);
    }
}
