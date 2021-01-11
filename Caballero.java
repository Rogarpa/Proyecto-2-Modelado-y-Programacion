
public class Caballero extends Aldeano{

    private static Caballero uniqueinstanceof;
    private Aldeano rehen;

    /**
    *Metodo para obtener la unica instancia del Caballero.
    *@return la unica instancia.
    */
    public static Caballero getinstance(){
        uniqueinstanceof=new Caballero();
        return uniqueinstanceof;

    }

    /**
    *Constructor de la clase.
    */
    protected Caballero(){
        cabello="Desconocido por el casco.";
        arma="Cuchillo oxidado.";
        ropa="Armadura de hierro forjado.";
    }

    /**
    *Metodo para que el caballero pueda usar su poder.
    */
    public void setRehen(Aldeano rehen){
        this.rehen=rehen;
    }

    /**
    *Metodo para obtener al rehen del caballero.
    *@return el rehen.
    */
    public Aldeano getRehen(){
        return this.rehen;
    }

    @Override
    public Magia morir(){
        Magia magia=new MagiaCaballero(this.getRehen(),this.getAldea());
        return magia;
    }

}
