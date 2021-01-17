
public class MagiaAngel implements Magia{

    private Aldeano aDormir;
    private Aldea aldeaHogar;
    private Aldeano usuario;

    /**
    *Constructor de la Clase.
    *@param aDormir el hombre-lobo victima a matar.
    *@param aldeaSobreLaCualActuar la aldea a la que pertenece el hombre-lobo.
    */
    public MagiaAngel(Aldeano aDormir,Aldea aldeaSobreLaCualActuar,Aldeano usuario){
        this.aDormir=aDormir;
        aldeaHogar=aldeaSobreLaCualActuar;
        this.usuario=usuario;
    }

    @Override
    public void actua(){
        aldeaHogar.matar(aDormir,usuario);
    }
}
