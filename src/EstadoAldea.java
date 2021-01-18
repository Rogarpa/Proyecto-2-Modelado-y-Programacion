 
public interface EstadoAldea{

    /**
    *Metodo para hacer una votación en la Aldea y ver a quien linchar.
    */
    public void convocarJuicio();

    /**
    *Metodo para saber quienes murieron en la noche.
    */
    public void recuentoNoche();

    /**
    *Metodo para que los lobos en la noche definan a quien devorar.
    */
    public void convocarBanquete();

    /**
    *Metodo para modelar que anochezca en la aldea.
    */
    public void anochece();
    /**
    *Metodo para modelar que amanezca en la aldea.
    */
    public void amanece();
}
 