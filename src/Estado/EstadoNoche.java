
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
        narrador.getControladorAldea().publicar("No es posible convocar al Juicio comunal");
        throw new UnsupportedOperationException("Accion no disponible para la aldea");
    }

    @Override
    public void recuentoNoche(){
        narrador.getControladorAldea().publicar("Aún no hay muertos.");
        throw new UnsupportedOperationException("Accion no disponible para la aldea");
    }

    @Override
    public void convocarBanquete(){
        narrador.getControladorAldea().publicar("Hombres-Lobo transformandose para comer.");
        narrador.iniciarMenuVotacionLobos();
    }

    @Override
    public void anochece(){
        narrador.getControladorAldea().publicar("Ya es de noche.");
        throw new UnsupportedOperationException("Accion no disponible para la aldea");
    }

    @Override
    public void amanece(){
        narrador.getControladorAldea().publicar("Esta amaneciendo.");
        narrador.setEstadoActual(narrador.getAmaneciendo());
    }

}
