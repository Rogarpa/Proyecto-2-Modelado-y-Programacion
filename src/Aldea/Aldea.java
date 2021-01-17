import java.util.LinkedList;

import src.Estado.EstadoAldea;

public class Aldea implements EstadoAldea{

    protected ControladorJuego controladorAldea;

    protected EstadoAldea noche;
    protected EstadoAldea dia;

    protected EstadoAldea EstadoActual;

    LinkedList<Aldeano> todos;
    ArrayList<Jugador> lobos;
    LinkedList<Jugador> muertosUltimaNoche;
    //

    /**
     *Constructor de la Clase.
     */
    public Aldea(ControladorJuego controladorAldea){
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

    public void getJugadores(){
        for(Jugador aMostrar : todos) 
            controladorAldea.mostrar(aMostrar.getDescripcion);
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

    public void getMuertosUltimaNoche(){
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

        this.controladorAldea.mostrar(aMatar.getNickname()+" fue asesinado por "+asesino.getNickname()+" con "+asesino.getArma());
    }

    /**
    *Metodo para cuando se muera alguien por linchamiento.
    *@param id el id del Jugador que fue votado para morir.
    */
    public void linchar(int id){
        Aldeano encontrado;
        todos.removeIf(x -> x.id == id);
        for(Aldeano aBuscar : todos){
            if(aBuscar.getId == id){
                encontrado = aBuscar;
                break;
            }
        }
        
        this.controladorAldea.mostrar("La aldea voto matar a " + encontrado.getDescripcion());
    }

    /**
    *Metodo para buscar a algun aldeano en especifico.
    *@param id el id del aldeano que buscamos.
    */
    public Aldeano juicio(int id){
        Aldeano encontrado;

        for(Aldeano elem:todos){
           if(elem.getId()==id){
            encontrado = elem;
           }
        }

        this.controladorAldea.mostrar("Los lobos decidieron matar a " + encontrado.getDescripcion());

    }

    public EstadoAldea getAnocheciendo(){ return noche;}
    public EstadoAldea getAmaneciendo(){ return dia;}
}
