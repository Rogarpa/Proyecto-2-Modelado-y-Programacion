
public class main{

    public static void main(String[] args){
        MenusJuego menu = new MenusJuego();
        ControladorJuego controladorAldea = null;
        Aldea aldea1 = new Aldea(controladorAldea);
        controladorAldea = new ControladorJuego(aldea1, menu);
    }
}