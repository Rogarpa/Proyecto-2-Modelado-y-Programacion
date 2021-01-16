
public class Angel extends Aldeano{

    private static Angel uniqueinstanceof;
    private static Aldeano lobo;

    /**
    *Metodo para obtener la unica instancia de la clase.
    *@return la instancia.
    */
    public static Angel getinstance(){
        uniqueinstanceof=new Angel(lobo);
        return uniqueinstanceof;
    }

    /**
    *El constructor de la clase.
    *@param lobo el aldeano sobre el que va a actuar.
    */
    protected Angel(Aldeano lobo){
        this.lobo=lobo;
    }

    /**
    *Metodo para que el angel pueda usar su poder.
    *@param lobo el aldenao sobre el cual va a actuar.
    */
    public void setLobo(Aldeano lobo){
        this.lobo=lobo;
    }

    /**
    *Metodo para obtener el lobo a morir.
    *@return el lobo.
    */
    public Aldeano getLobo(){
        return this.lobo;
    }


    @Override
    public Magia morir(){
        Magia magia=new MagiaAngel(this.lobo,this.getAldea());
        return magia;
    }

}
