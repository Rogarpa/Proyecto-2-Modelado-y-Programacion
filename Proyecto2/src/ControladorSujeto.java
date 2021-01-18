public interface ControladorSujeto{

    /**
    *Metodo para agregar más observadores.
    *@param aSuscribir el nuevo observador.
    */
    public void suscribir(ObservadorVista aSuscribir);

    /**
    *Metodo para desuscribir a un observador.
    *@param aDesuscribir el observador a desuscribir.
    */
    public void desuscribir(ObservadorVista aDesuscribir);

    /**
    *Metodo para imprimir mensajes sin romper a MVC.
    *@param mensaje lo que se quiere imprimir.
    */
    public void publicar(String mensaje);
}
