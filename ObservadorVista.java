public interface ObservadorVista{

    /**
    *Metodo para actualizar a los observadores.
    */
    public void actualiza();

    /**
    *Metodo para imprimir cosas sin romper MVC.
    *@param mensaje el mensaje a imprimir.
    */
    public void mostrar(String mensaje);
}
