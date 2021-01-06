
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
        System.out.println("No es posible convocar al Juicio comunal");
    }

    @Override
    public void recuentoNoche(){
        System.out.println("A continuación los aldeanos encontrados muertos.");
    }

    @Override
    public void convocarBanquete(){
        System.out.println("Ya ocurrio la noche pasada.");
        throw new UnsupportedOperationException("Accion no disponible para la aldea");
    }

    @Override
    public void anochece(){
        System.out.println("Se está ocultando el sol.");
    }

    @Override
    public void amanece(){
        System.out.println("Ya es de día.");
        throw new UnsupportedOperationException("Accion no disponible para la aldea");
    }
}
