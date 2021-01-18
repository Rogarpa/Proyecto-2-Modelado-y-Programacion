
public class BuilderLobo implements BuilderJugador{
    public Lobo personajeAConstruir;

    public BuilderLobo(){
        personajeAConstruir = new Lobo();
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
    //este creo que no implementa, deberemos borrarlo
    /**
    *Metodo para obtener el aldeano a construir.
    *@return el Aldeano.
    */
    public Lobo getPersonaje(){
        return this.personajeAConstruir;
    }
    
}
