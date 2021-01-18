
public class BuilderAldeano implements BuilderJugador{
    public AldeanoComun personajeAConstruir;


    public BuilderAldeano(){
        personajeAConstruir = new AldeanoComun();
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
    *Metodo para obtener el aldeano a construir.
    *@return el Aldeano.
    */
    public Aldeano getPersonaje(){
        return this.personajeAConstruir;
    }
}
