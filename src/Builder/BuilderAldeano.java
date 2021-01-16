
public class BuilderAldeano implements BuilderJugador{
    public Aldeano personajeAConstruir;

    public BuilderAldeano(int id,String nickname,Aldea aldeHogar){
        personajeAConstruir.id=id;
        personajeAConstruir.nickname=nickname;
        personajeAConstruir.aldea=aldeaHogar;
    }

    public void setCabello(String cabello){
        personajeAConstruir.cabello=cabello;
    }

    public void setArma(String arma){
        personajeAConstruir.arma=arma;
    }

    public void setRopa(Strnig ropa){
        personajeAConstruir.ropa=ropa;
    }

    public void setAldea(Aldea aldea){
        personajeAConstruir.aldea=aldea;
    }

    public Aldeano getPersonaje(){
        return this.personajeAConstruir;
    }
}
