
public class Aldea implements EstadoAldea{

    private EstadoAldea noche;
    private EstadoAldea dia;

    private EstadoAldea EstadoActual;

    /**
    *Constructor de la Clase.
    */
    public Aldea(){
        dia=new EstadoDia(this);
        noche=new EstadoNoche(this);

        EstadoActual=dia;
    }

    public Aldea(EstadoAldea EstadoActual){
        this.EstadoActual=EstadoActual;

        dia=new EstadoDia(this);
        noche= new EstadoNoche(this);
    }


    @Override
    public void convocarJuicio(){
        EstadoActual.convocarJuicio();
    }

    @Override
    public void recuentoNoche(){
        EstadoActual.recuentoNoche();
    }

    @Override
    public void convocarBanquete(){
        EstadoActual.convocarBanquete();
    }

    @Override
    public void anochece(){
        EstadoActual.anochece();
    }

    @Override
    public void amanece(){
        EstadoActual.amanece();
    }

    /**
    *Metodo para matar a alguien en la Aldea.
    *@param aMatar el aldeano a matar.
    *@param asesino el aldeano que mata.
    */
    public void matar(Aldeano aMatar,Aldeano asesino){
        aMatar.morir();
        System.out.println(aMatar.getNickname()+" fue asesinado por "+asesino.getNickname()+" con "+asesino.getArma());
    }

    /**
    *Metodo para cambiár el Estado de la Aldea.
    *@param EstadoActual el nuevo estado.
    */
    public void setEstadoActual(EstadoAldea EstadoActual){
        this. EstadoActual = EstadoActual;
    }

    public EstadoAldea getAnocheciendo(){ return noche;}
    public EstadoAldea getAmaneciendo(){ return dia;}
}
