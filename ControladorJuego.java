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
        switch (tipoJuego) {
            case 1:
                iniciarTipoJuego1();    
                break;
            case 1:
                iniciarTipoJuego2();
                break;
            case 3:
                iniciarTipoJuego3();
                break;
            default:
                break;
        }
    }
    
    public void iniciarTipoJuego1(){
        //aquí comienza a rellenar aldea y la manda a mostrar() de menusAControlar al finalizar
    }
    public void iniciarTipoJuego2(){

    }
    public void iniciarTipoJuego3(){

    }
}