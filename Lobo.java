
public class Lobo implements Cloneable{

    private Aldea aldea;
    private int id;
    private String nickname;

    /**
    *Metodo para crear hombres lobos con prototype.
    *@return un prototype de lobo.
    */
    public Object clone(){
        Object clone=null;

        try{
            clone=super.clone
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
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
}
