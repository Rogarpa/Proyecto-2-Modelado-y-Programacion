import java.util.LinkedList;

public class Aldea implements EstadoAldea{

    protected ControladorJuego controladorAldea;

    protected EstadoAldea noche;
    protected EstadoAldea dia;

    protected EstadoAldea EstadoActual;

    LinkedList<Aldeano> todos;
    ArrayList<Jugador> lobos;
    //

    /**
     *Constructor de la Clase.
     */
    public Aldea(ControladorJuego : controladorAldea){
        this.controladorAldea = controladorAldea;
        
        dia=new EstadoDia(this);
        noche=new EstadoNoche(this);

        todos=new LinkedList<>();
        lobos=new LinkedList<>();

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
        
        todos=new LinkedList<>();
        lobos=new LinkedList<>();
    }

    public ControladorJuego getControladorAldea(){return controladorAldea;}

    public void agregarAldeano(Aldeano aAgregar){todos.add(aAgregar;)}

    public void agregarLobo(Lobo aAgregar){lobos.add(aAgregar);}


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

        System.out.println(aMatar.getNickname()+" fue asesinado por "+asesino.getNickname()+" con "+asesino.getArma());
    }

    /**
    *Metodo para cuando se muera alguien por linchamiento.
    *@param id el id del Jugador que fue votado para morir.
    */
    public String linchar(int id){
        todos.removeIf(x -> x.id == id);
        return "La aldea voto matar a"/**e.getNickname()+"con id"+e.getId()*/;
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

    public EstadoAldea getAnocheciendo(){ return noche;}
    public EstadoAldea getAmaneciendo(){ return dia;}
}
