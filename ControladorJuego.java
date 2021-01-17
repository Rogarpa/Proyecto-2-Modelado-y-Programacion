
import java.util.*;

public class ControladorJuego implements ControladorSujeto {
    protected MenusJuego menusAControlar;
    protected Aldea aldeaAControlar;

    protected LinkedList<ObservadorVista> observadores= new LinkedList<ObservadorVista>();;

    /**
    *Constructor de la clase.
    *@param aldeaAControlar la aldea sobre la cual actua el controlador.
    *@param menusAControlar los menus para gestionar la aldea.
    */
    public ControladorJuego(Aldea aldeaAControlar, MenusJuego menusAControlar){
        this.aldeaAControlar = aldeaAControlar;
        this.menusAControlar = menusAControlar;
        menusAControlar.bienvenida();
        iniciarJuego();
    }

    /**
    *Metodo para cuando queramos que el controlador realice el mensaje de bienvenida.
    */
    public void bienvenida(){
        menusAControlar.bienvenida();
    }

    /**
    *Metodo para inciar el juego.
    */
    public void iniciarJuego(){
        int opcionInicial = menusAControlar.menuInicial();
        switch (opcionInicial) {
            case 1:
            menusAControlar.tutorial();
            break;
            case 2:
            menusAControlar.bienvenida();
            menusAControlar.seleccionarTipoJuego();
            break;
            case 3:
            return;

            default:
            break;
        }
        rellenarAldea();
    }

    /**
    *Metodo para cuando queramos ya tener aldeanos concretos.
    */
    public void rellenarAldea(){
        int tipoJuego = menusAControlar.seleccionarTipoJuego();
        String[] listaNicknames;
        switch (tipoJuego) {
            case 1:
                listaNicknames = obtenerListaNicknamesJuego1();
                break;
            case 2:
                listaNicknames = obtenerListaNicknamesJuego2();
                break;
            case 3:
                listaNicknames = obtenerListaNicknamesJuego3();
                break;
            default:
                break;
        }

        //sortear y rellenar aldeaAControlar metiendo en un for each el arreglgo de nicknames y creándolos con builder, metiéndolos a la aldea con el método
        BuilderAldeano builderPersonajes = new BuilderAldeano();
        
        DirectorBuilderJugador director = new DirectorBuilderJugador(builderPersonajes);
        int indiceArregloNicknames = 0;
        director.creaAldeanoComun(indiceArregloNicknames, listaNicknames[indiceArregloNicknames], aldeaAControlar);

        int numeroLobos = 0;
        int numeroAldeanos = 0;

        switch (tipoJuego) {
            case 1:
                numeroLobos =     
            
                break;
            case 1:
                
                break;
            default:
                break;
        }
        for(int i=0; i<3; i++) aldeaAControlar.agregarAldeano(builderPersonajes.getPersonaje());
        director.creaLobo(indiceArregloNicknames, listaNicknames[indiceArregloNicknames], aldeaAControlar);
        for(int i=0; i<3; i++) aldeaAControlar.agregarLobo(builderPersonajes.getPersonaje());


        director.creaAngel(indiceArregloNicknames, listaNicknames[indiceArregloNicknames], aldeaAControlar);
        aldeaAControlar.agregarAldeano(builderPersonajes.getPersonaje());
        director.creaCaballero(indiceArregloNicknames, listaNicknames[indiceArregloNicknames], aldeaAControlar);
        aldeaAControlar.agregarAldeano(builderPersonajes.getPersonaje());
        director.creaCazador(indiceArregloNicknames, listaNicknames[indiceArregloNicknames], aldeaAControlar);
        aldeaAControlar.agregarAldeano(builderPersonajes.getPersonaje());
        director.creaVidente(indiceArregloNicknames, listaNicknames[indiceArregloNicknames], aldeaAControlar);
        aldeaAControlar.agregarAldeano(builderPersonajes.getPersonaje());

        if(tipoJuego == 1) return;

        director.creaAldeanoComun(indiceArregloNicknames, listaNicknames[indiceArregloNicknames], aldeaAControlar);
        for(int i=0; i<2; i++) aldeaAControlar.agregarAldeano(builderPersonajes.getPersonaje());
        director.creaLobo(indiceArregloNicknames, listaNicknames[indiceArregloNicknames], aldeaAControlar);
        for(int i=0; i<3; i++) aldeaAControlar.agregarLobo(builderPersonajes.getPersonaje());

        if(tipoJuego == 2) return;

        director.creaAldeanoComun(indiceArregloNicknames, listaNicknames[indiceArregloNicknames], aldeaAControlar);
        for(int i=0; i<3; i++) aldeaAControlar.agregarAldeano(builderPersonajes.getPersonaje());
        director.creaLobo(indiceArregloNicknames, listaNicknames[indiceArregloNicknames], aldeaAControlar);
        for(int i=0; i<2; i++) aldeaAControlar.agregarLobo(builderPersonajes.getPersonaje());

        aldeaAControlar.comenzarCicloDiaNoche();
    }

    /**
    *Metodo para iniciar un juego de tipo 1.
    *@return un array con todos los nicknames.
    */
    public String[] obtenerListaNicknamesJuego1(){
        menusAControlar.instruccionesTipoJuego(1);
        String[] listaNicknames = new String[10];
        for(String nuevoNickname: listaNicknames)
            nuevoNickname = menusAControlar.getNicknameJugadorNuevo();
        return listaNicknames;
    }

    /**
    *Metodo para iniciar un juego de tipo .
    *@return un array con todos los nicknames.
    */
    public String[] obtenerListaNicknamesJuego2(){
        menusAControlar.instruccionesTipoJuego(1);
        String[] listaNicknames = new String[10];
        for(String nuevoNickname: listaNicknames)
            nuevoNickname = menusAControlar.getNicknameJugadorNuevo();
        return listaNicknames;
    }

    /**
    *Metodo para iniciar un juego de tipo .
    *@return un array con todos los nicknames.
    */
    public String[] obtenerListaNicknamesJuego3(){
        menusAControlar.instruccionesTipoJuego(1);
        String[] listaNicknames = new String[10];
        for(String nuevoNickname: listaNicknames)
            nuevoNickname = menusAControlar.getNicknameJugadorNuevo();
        return listaNicknames;
    }

    public LinkedList<int[]> obtenerCorrelacionIdsNominaciones(){
        menusAControlar.getNominacion();
    }

    @Override
    public void suscribir(ObservadorVista aSuscribir){
        observadores.add(aSuscribir);
    }

    @Override
    public void desuscribir(ObservadorVista aDesuscribir){
        observadores.remove(aDesuscribir);
    }

    @Override
    public void publicar(String mensaje){
        for(ObservadorVista obs : observadores) obs.mostrar(mensaje);
    }
}
