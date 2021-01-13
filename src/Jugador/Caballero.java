
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
    *@param rehen el aldeano sobre el cual actuar.
    */
    protected Caballero(Aldeano rehen){
        this.rehen=rehen;
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
        Magia magia=new MagiaCaballero(this.rehen,this.getAldea());
        return magia;
    }

}
