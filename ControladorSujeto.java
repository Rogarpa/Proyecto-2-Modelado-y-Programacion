public interface ControladorSujeto{

    public void suscribir(Observador aSuscribir);
    
    public void desuscribir(Observador aDesuscribir);

    public void publicar(String mensaje);
}
