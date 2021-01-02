
public abstract class Lobo implements Jugador,Cloneable{

    private String arma;
    private String ropa;
    private String cabello;
    private Aldea aldea;
    private int id;
    private String nickname;

    /**
    *Metodo para crear hombres lobos con prototype.
    *@return un prototype de lobo.
    */
    public Object clone(){
        /**Object clone=null;

        try{
            clone=super.clone;
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;*/
        return null;
    }

    /**
    *Metodo que obtiene el id del Aldeano.
    *@return el id
    */
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
    public void morir(){}

    /**
    *Metodo para obtener su ropa.
    */
    public void getRopa(){
        System.out.println(this.ropa);
    }

    /**
    *Metodo para obtener su arma.
    */
    public void getArma(){
        System.out.println(this.arma);
    }

    /**
    *Metodo para obtener el cabello.
    */
    public void getCabello(){
        System.out.println(this.cabello);
    }
}
