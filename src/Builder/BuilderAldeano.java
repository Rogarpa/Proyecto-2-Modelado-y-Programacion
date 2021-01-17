
public class BuilderAldeano implements BuilderJugador{
    public Aldeano personajeAConstruir;

    /**
    *Constructor de la clase.
    *@param id el id del aldeano.
    *@param nickname el nombre del aldeano.
    *@param aldeaHogar la aldea a la que pertenece.
    */
    public BuilderAldeano(int id,String nickname,Aldea aldeHogar){
        personajeAConstruir.id=id;
        personajeAConstruir.nickname=nickname;
        personajeAConstruir.aldea=aldeaHogar;
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
    public void setRopa(Strnig ropa){
        personajeAConstruir.ropa=ropa;
    }

    @Override
    public void setAldea(Aldea aldea){
        personajeAConstruir.aldea=aldea;
    }
    //este creo que no implementa, deberemos borrarlo
    @Override
    public Aldeano getPersonaje(){
        return this.personajeAConstruir;
    }
}
