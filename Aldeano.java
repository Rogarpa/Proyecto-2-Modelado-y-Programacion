
public abstract class Aldeano implements Jugador{

    private String ropa;
    private String cabello;
    private String arma;
    private Aldea aldea;
    private int id;
    private String nickname;

    @Override
    public int getId(){
        return this.id;
    }

    /**
    *Metodo que obtiene la aldea a la que pertenece el Aldeano.
    *@return la aldea.
    */
    public Aldea getAldea(){
        return this.aldea;
    }

    /**
    *Metodo para obtener el nombre del Aldeano.
    *@return el nombre.
    */
    public String getNickname(){
        return this.nickname;
    }

    @Override
    public void morir(){

    }
}
