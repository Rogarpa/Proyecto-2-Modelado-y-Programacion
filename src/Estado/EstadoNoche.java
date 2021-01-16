
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
        System.out.println("No es posible convocar al Juicio comunal");
        throw new UnsupportedOperationException("Accion no disponible para la aldea");
    }

    @Override
    public void recuentoNoche(){
        System.out.println("Aún no hay muertos.");
        throw new UnsupportedOperationException("Accion no disponible para la aldea");
    }

    @Override
    public void convocarBanquete(){
        System.out.println("Hombres-Lobo transformandose para comer.");
        narrador.iniciarMenuVotacionLobos();
    }

    @Override
    public void anochece(){
        System.out.println("Ya es de noche.");
        throw new UnsupportedOperationException("Accion no disponible para la aldea");
    }

    @Override
    public void amanece(){
        System.out.println("Esta amaneciendo.");
        narrador.setEstadoActual(narrador.getAmaneciendo());
    }

}
