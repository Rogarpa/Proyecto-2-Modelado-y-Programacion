public class ControladorJuego implements ControladorSujeto {
    protected MenusJuego menusAControlar;
    protected Aldea aldeaAControlar;

    public ControladorJuego(Aldea aldeaAControlar, MenusJuego menusAControlar){
        this.aldeaAControlar = aldeaAControlar;
        this.menusAControlar = menusAControlar;
        menusAControlar.bienvenida();
        iniciarJuego();
    }

    public bienvenida(){
        menusAControlar.bienvenida();
    }

    public void iniciarJuego(){
        int opcionInicial = menusAControlar.menuInicial;
        switch (opcionInicial) {
            case value:
                
                break;
        
            default:
                break;
        }
    }

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
    
    public String[] iniciarTipoJuego1(){
        menusAControlar.instruccionesTipoJuego(1);
        String[] listaNicknames = new String[10];
        for(String nuevoNickname: listaNicknames)   
            nuevoNickname = menusAControlar.getNicknameJugadorNuevo();
        return listaNicknames;
    }
    public String[] iniciarTipoJuego2(){
        menusAControlar.instruccionesTipoJuego(1);
        String[] listaNicknames = new String[10];
        for(String nuevoNickname: listaNicknames)   
            nuevoNickname = menusAControlar.getNicknameJugadorNuevo();
        return listaNicknames;
    }
    public String[] iniciarTipoJuego3(){
        menusAControlar.instruccionesTipoJuego(1);
        String[] listaNicknames = new String[10];
        for(String nuevoNickname: listaNicknames)   
            nuevoNickname = menusAControlar.getNicknameJugadorNuevo();
        return listaNicknames;
    }
}