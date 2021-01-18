
public class main{

    public static void main(String[] args){
        MenusJuego menu = new MenusJuego();
        Aldea aldea1 = new Aldea();
        ControladorJuego controladorAldea = new ControladorJuego(aldea1, menu);
        aldea1.setControladorAldea(controladorAldea);
        controladorAldea.suscribir(menu);
        controladorAldea.iniciarJuego();
    }
}