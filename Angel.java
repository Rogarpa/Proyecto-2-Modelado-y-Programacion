
public class Angel extends Aldeano{

    private static Angel uniqueinstanceof;

    /**
    *Metodo para obtener la unica instancia de la clase.
    *@return la instancia.
    */
    public static Angel getinstance(){
        uniqueinstanceof=new Angel();
        return uniqueinstanceof;
    }

    /**
    *El constructor de la clase.
    */
    protected Angel(){
        cabello="Rubio de lado.";
        arma="Espada bendita.";
        ropa="Toga y alas.";
    }

    /**
    *Meotdo para que la vidente pueda usar su poder.
    */
    public Lobo mefui(){
        return null;
    }

    @Override
    public Magia morir(){
        Magia magia=new MagiaAngel(this.mefui(),this.getAldea());
        return magia;
    }

}
