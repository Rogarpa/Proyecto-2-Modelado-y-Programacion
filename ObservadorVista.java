public interface ObservadorVista{

    private ControladorSuejeto sujeto;

    /**
    *Metodo para actualizar a los observadores.
    */
    public void actualiza();

    /**
    *Metodo para imprimir cosas sin romper MVC.
    *@param mensaje el mensaje a imprimir.
    */
    public mostrar(String mensaje);
}
