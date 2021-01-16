public interface ControladorSujeto{

    /**
    *Metodo para agregar más observadores.
    *@param aSuscribir el nuevo observador.
    */
    public void suscribir(Observador aSuscribir);

    /**
    *Metodo para desuscribir a un observador.
    *@param aDesuscribir el observador a desuscribir.
    */
    public void desuscribir(Observador aDesuscribir);
}
