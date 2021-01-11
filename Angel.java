
public class Angel extends Aldeano{

    private static Angel uniqueinstanceof;
    private Aldeano lobo;

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
    public void mefui(Aldeano lobo){
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
        Magia magia=new MagiaAngel(this.getLobo(),this.getAldea());
        return magia;
    }

}
