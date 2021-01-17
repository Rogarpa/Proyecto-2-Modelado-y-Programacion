
public class EstadoDia implements EstadoAldea{

    protected Aldea narrador;

    /**
    *Constructor de la Clase.
    *@param narrador la aldea donde es de dia.
    */
    public EstadoDia(Aldea narrador){
        this.narrador=narrador;
    }

    @Override
    public void convocarJuicio(){
        narrador.getControladorAldea().muestra("No es posible convocar al Juicio comunal");
        narrador.iniciarMenuvotacionAldeanos();
    }

    @Override
    public void recuentoNoche(){
        narrador.getControladorAldea().muestra("A continuación los aldeanos encontrados muertos.");
        narrador.informeDiario();
    }

    @Override
    public void convocarBanquete(){
        narrador.getControladorAldea().muestra("Ya ocurrio la noche pasada.");
        throw new UnsupportedOperationException("Acción no disponible para la aldea");
    }

    @Override
    public void anochece(){
        narrador.getControladorAldea().muestra("Se está ocultando el sol.");
        narrador.setEstadoActual(narrador.getAnocheciendo());
    }

    @Override
    public void amanece(){
        narrador.getControladorAldea().muestra("Ya es de día.");
        throw new UnsupportedOperationException("Acción no disponible para la aldea");
    }
}
