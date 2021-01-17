import java.util.*;

public class Aldea implements EstadoAldea{

    protected ControladorJuego controladorAldea;

    protected EstadoAldea noche;
    protected EstadoAldea dia;

    protected EstadoAldea EstadoActual;

    LinkedList<Aldeano> todos;
    ArrayList<Lobo> lobos;
    //

    /**
     *Constructor de la Clase.
     */
    public Aldea(ControladorJuego controladorAldea){
        this.controladorAldea = controladorAldea;

        dia=new EstadoDia(this);
        noche=new EstadoNoche(this);

        todos=new LinkedList<Aldeano>();
        lobos=new ArrayList<Lobo>();

        EstadoActual=dia;
    }

    /**
    *Constructor para cambiar el estado de la aldea.
    *@param EstadoActual el estado al que pasa la aldea.
    */
    public Aldea(EstadoAldea EstadoActual){
        this.EstadoActual=EstadoActual;

        dia=new EstadoDia(this);
        noche= new EstadoNoche(this);

        todos=new LinkedList<Aldeano>();
        lobos=new ArrayList<Lobo>();
    }

    /**
    *Metodo para obtener el controlador de la aldea.
    *@return el controlador de la aldea.
    */
    public ControladorJuego getControladorAldea(){return controladorAldea;}

    /**
    *Metodo para agregar un aldeano.
    *@param aAgregar el aldeano a agregar.
    */
    public void agregarAldeano(Aldeano aAgregar){todos.add(aAgregar);}

    /**
    *Metodo para agregar un hombre lobo a el grupo de hombres lobos.
    *@param aAgregar el hombre lo a agregar.
    */
    public void agregarLobo(Lobo aAgregar){
        todos.add(aAgregar);
        lobos.add(aAgregar);
    }


    /**
    *Metodo para cambiár el Estado de la Aldea.
    *@param EstadoActual el nuevo estado.
    */
    public void setEstadoActual(EstadoAldea EstadoActual){
        this. EstadoActual = EstadoActual;
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

        todos.remove(aMatar);

        this.controladorAldea.publicar(aMatar.getNickname()+" fue asesinado por "+asesino.getNickname()+" con "+asesino.getArma());
    }

    /**
    *Metodo para cuando se muera alguien por linchamiento.
    *@param id el id del Jugador que fue votado para morir.
    */
    public void linchar(int id){
        todos.removeIf(x -> x.id == id);
        this.controladorAldea.publicar("La aldea voto matar a"/**e.getNickname()+"con id"+e.getId()*/);
    }

    /**
    *Metodo para buscar a algun aldeano en especifico.
    *@param id el id del aldeano que buscamos.
    *@return el aldeano que buscamos.
    */
    public Aldeano juicio(int id){

        for(Aldeano elem:todos){
           if(elem.getId()==id){
             return elem;
           }
        }

        return null;
    }

    /**
    *Metodo para obtener el estado de dia de la aldea.
    *@return el estado de la aldea.
    */
    public EstadoAldea getAnocheciendo(){ return noche;}

    /**
    *Metodo para obtener el estado de noche de la aldea,
    *@return el estado de la aldea.
    */
    public EstadoAldea getAmaneciendo(){ return dia;}
}
