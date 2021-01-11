
public class Cazador extends Aldeano{

    private static Cazador uniqueinstanceof;
    private Aldeano esbirro;

    /**
    *Metodo para obtener la unica instancia de la clase.
    *@return la instancia.
    */
    public static Cazador getinstance(){
        uniqueinstanceof=new Cazador();
        return uniqueinstanceof;
    }

    /**
    *Constructor de la clase.
    */
    protected Cazador(){
        cabello="Negro, tapado por su sombrero bombardero ruso.";
        ropa="Chamarra de lana y pantalones igual de lana.";
        arma="Rifle de candado.";
    }

    /**
    *Metodo para que el cazador pueda usar su poder.
    */
    public void setEsbirro(Aldeano esbirro){
        this.esbirro=esbirro;
    }

    /**
    *Metodo para obtener el rehen.
    *@return el rehen.
    */
    public Aldeano getEsbirro(){
        return this.esbirro;
    }

    @Override
    public Magia morir(){
        Magia magia=new MagiaCazador(this.getEsbirro(),this.getAldea());
        return magia;
    }

}
