
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
        String[] listaNicknames = null;
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

        
        System.out.println("la lista obtenida fue");
        for(String s: listaNicknames) System.out.println(s);

        BuilderAldeano[] buildersAldeanos = new BuilderAldeano[8];
        for(int i=0; i<8; i++) buildersAldeanos[i] = new BuilderAldeano();
        BuilderLobo[] buildersLobos = new BuilderLobo[8];
        for(int i=0; i<8; i++) buildersLobos[i] = new BuilderLobo();
            
        BuilderAngel builderAngel = new BuilderAngel();
        BuilderCaballero builderCaballero = new BuilderCaballero();
        BuilderVidente builderVidente = new BuilderVidente();
        BuilderCazador builderCazador = new BuilderCazador();

        DirectorBuilderJugador director = new DirectorBuilderJugador(buildersAldeanos[0]);

        int indiceArregloNicknames = 0;

        int numeroLobos = 0;
        int numeroAldeanos = 0;

        switch (tipoJuego) {
            case 1:
                numeroAldeanos = 3;
                numeroLobos =  3;
                break;
            case 2:
                numeroAldeanos = 5;
                numeroLobos = 6;
                break;
            case 3:
                numeroLobos = 8;
                numeroAldeanos = 8;
                break;
            default:
                break;
        }

        for(int i=0; i<numeroAldeanos; i++) {
            director.cambiarBuilder(buildersAldeanos[i]);
            director.creaAldeanoComun(indiceArregloNicknames, listaNicknames[indiceArregloNicknames], aldeaAControlar);
            aldeaAControlar.agregarAldeano(buildersAldeanos[i].getPersonaje());
            indiceArregloNicknames++;


        }

        for(int i=0; i<numeroLobos; i++){
            director.cambiarBuilder(buildersLobos[i]);
            director.creaLobo(indiceArregloNicknames, listaNicknames[indiceArregloNicknames], aldeaAControlar);
            aldeaAControlar.agregarLobo(buildersLobos[i].getPersonaje());
            indiceArregloNicknames++;
        }

        director.cambiarBuilder(builderAngel);
        director.creaAngel(indiceArregloNicknames, listaNicknames[indiceArregloNicknames], aldeaAControlar,aldeaAControlar.getPersonaje(1));
        aldeaAControlar.agregarAldeano(builderAngel.getPersonaje());

        indiceArregloNicknames++;
        director.cambiarBuilder(builderCaballero);
        director.creaCaballero(indiceArregloNicknames, listaNicknames[indiceArregloNicknames], aldeaAControlar,aldeaAControlar.getPersonaje(2));
        aldeaAControlar.agregarAldeano(builderCaballero.getPersonaje());

        indiceArregloNicknames++;
        director.cambiarBuilder(builderCazador);
        director.creaCazador(indiceArregloNicknames, listaNicknames[indiceArregloNicknames], aldeaAControlar,aldeaAControlar.getPersonaje(3));
        aldeaAControlar.agregarAldeano(builderCazador.getPersonaje());

        indiceArregloNicknames++;
        director.cambiarBuilder(builderVidente);
        director.creaVidente(indiceArregloNicknames, listaNicknames[indiceArregloNicknames], aldeaAControlar,aldeaAControlar.getPersonaje(4));
        aldeaAControlar.agregarAldeano(builderVidente.getPersonaje());

        aldeaAControlar.comenzarCicloDiaNoche();
    }

    /**
    *Metodo para iniciar un juego de tipo 1.
    *@return un array con todos los nicknames.
    */
    public String[] obtenerListaNicknamesJuego1(){
        menusAControlar.instruccionesTipoJuego(1);
        String[] listaNicknames = new String[10];
        int contador = 0;
        while(contador<10){
            listaNicknames[contador] = menusAControlar.getNicknameJugadorNuevo();
            contador++;
        }
        return listaNicknames;
    }

    /**
    *Metodo para iniciar un juego de tipo .
    *@return un array con todos los nicknames.
    */
    public String[] obtenerListaNicknamesJuego2(){
        menusAControlar.instruccionesTipoJuego(1);
        String[] listaNicknames = new String[15];
        int contador = 0;
        while(contador++<15){
            listaNicknames[contador] = menusAControlar.getNicknameJugadorNuevo();
            contador++;
        }
        return listaNicknames;
    }

    /**
    *Metodo para iniciar un juego de tipo .
    *@return un array con todos los nicknames.
    */
    public String[] obtenerListaNicknamesJuego3(){
        menusAControlar.instruccionesTipoJuego(1);
        String[] listaNicknames = new String[20];
        int contador = 0;
        while(contador++<10){
            listaNicknames[contador] = menusAControlar.getNicknameJugadorNuevo();
            contador++;
        }
        return listaNicknames;
    }

    /**
    *Metodo para obtener las nominaciones para la votación.
    *@return una lista con los id de los nominados.
    */
    public LinkedList<int[]> obtenerCorrelacionIdsNominaciones(){
        return menusAControlar.getNominacion();
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
