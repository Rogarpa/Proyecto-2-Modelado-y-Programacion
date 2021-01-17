
public class EstadoNoche implements EstadoAldea{

    protected Aldea narrador;

    /**
    *Constructor de la clase.
    *@param narrador la aldea donde es de noche.
    */
    public EstadoNoche(Aldea narrador){
            this.narrador=narrador;
    }

    @Override
    public void convocarJuicio(){
        narrador.getControladorAldea().muestra("No es posible convocar al Juicio comunal");
        throw new UnsupportedOperationException("Accion no disponible para la aldea");
    }

    @Override
    public void recuentoNoche(){
        narrador.getControladorAldea().muestra("Aún no hay muertos.");
        throw new UnsupportedOperationException("Accion no disponible para la aldea");
    }

    @Override
    public void convocarBanquete(){
        narrador.getControladorAldea().muestra("Hombres-Lobo transformandose para comer.");
        narrador.iniciarMenuVotacionLobos();
    }

    @Override
    public void anochece(){
        narrador.getControladorAldea().muestra("Ya es de noche.");
        throw new UnsupportedOperationException("Accion no disponible para la aldea");
    }

    @Override
    public void amanece(){
        narrador.getControladorAldea().muestra("Esta amaneciendo.");
        narrador.setEstadoActual(narrador.getAmaneciendo());
    }

}
