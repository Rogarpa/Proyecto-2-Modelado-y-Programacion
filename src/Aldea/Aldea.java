import java.util.*;

public class Aldea implements EstadoAldea{

    protected ControladorJuego controladorAldea;

    protected EstadoAldea noche;
    protected EstadoAldea dia;

    protected EstadoAldea EstadoActual;

    LinkedList<Aldeano> todos;
    LinkedList<Jugador> muertosUltimaNoche;
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
    *Metodo para que comience un ciclo y que el estado de la aldea cambie.
    */
    public void comenzarCicloDiaNoche(){
        EstadoActual = dia;
        while(todos.size() != 0 && lobos.size() != 0){
            anochece();
            convocarBanquete();
            amanece();
            recuentoNoche();
            convocarJuicio();
        }

    }

    /**
    *Metodo para cuando queramos obtener todos los jugadores en la simulación.
    */
    public void getJugadores(){
        for(Jugador aMostrar : todos)
            controladorAldea.publicar(aMostrar.getDescripcion());
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
    *Metodo para obtener los muertos durante el estado de Noche.
    *@return una lista de los muertos.
    */
    public LinkedList<Jugador> getMuertosUltimaNoche(){
        return muertosUltimaNoche;
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
        Aldeano encontrado=null;

        for(Aldeano aBuscar : todos){
            if(aBuscar.getId() == id){
                encontrado = aBuscar;
                break;
            }
        }

        this.controladorAldea.publicar("La aldea voto matar a " + encontrado.getDescripcion());
    }

    /**
    *Metodo para buscar a algun aldeano en especifico.
    *@param id el id del aldeano que buscamos.
    */
    public Aldeano juicio(int id){
        Aldeano encontrado=null;

        for(Aldeano elem:todos){
           if(elem.getId()==id){
            encontrado = elem;
           }
        }

        this.controladorAldea.publicar("Los lobos decidieron matar a " + encontrado.getDescripcion());
        return encontrado;
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
