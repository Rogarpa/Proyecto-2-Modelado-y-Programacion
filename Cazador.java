
public class Cazador extends Aldeano{

    private static Cazador uniqueinstanceof;

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
    public Jugador setEsbirro(){
        return null;
    }

    @Override
    public Magia morir(){
        Magia magia=new MagiaCazador(this.setEsbirro(),this.getAldea());
        return magia;
    }

}
