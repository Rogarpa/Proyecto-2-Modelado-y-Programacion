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
        int opcionInicial = menusAControlar.menuInicial;
        switch (opcionInicial) {
            case value:

                break;

            default:
                break;
        }
    }

    /**
    *Metodo para cuando queramos ya tener aldeanos concretos.
    */
    public void rellenarAldea(){
        int tipoJuego = menusAControlar.seleccionarTipoJuego();
        String[] listaNicknames;
        switch (tipoJuego) {
            case 1:
                listaNicknames = iniciarTipoJuego1();
                break;
            case 1:
                listaNicknames = iniciarTipoJuego2();
                break;
            case 3:
                listaNicknames = iniciarTipoJuego3();
                break;
            default:
                break;
        }

        //sortear y rellenar aldeaAControlar metiendo en un for each el arreglgo de nicknames y creándolos con builder, metiéndolos a la aldea con el método

    }

    /**
    *Metodo para iniciar un juego de tipo 1.
    *@return un array con todos los nicknames.
    */
    public String[] iniciarTipoJuego1(){
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
    public String[] iniciarTipoJuego2(){
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
    public String[] iniciarTipoJuego3(){
        menusAControlar.instruccionesTipoJuego(1);
        String[] listaNicknames = new String[10];
        for(String nuevoNickname: listaNicknames)
            nuevoNickname = menusAControlar.getNicknameJugadorNuevo();
        return listaNicknames;
    }

    @Override
    public void suscribir(ObservadorVista aSuscribir){
        observadoresr.add(aSuscribir);
    }

    @Override
    public void desuscribir(ObservadorVista aDesuscribir){
        observadores.remove(aDesuscribir);
    }
}
