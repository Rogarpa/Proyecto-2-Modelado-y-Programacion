
public abstract class Aldeano implements Jugador,Cloneable{

    protected String ropa;
    protected String cabello;
    protected String arma;
    protected Aldea aldea;
    protected int id;
    protected String nickname;

    public void setId(int id){
        this.id = id;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setAldea(Aldea aldea){
        this.aldea = aldea;
    }

    @Override
    public int getId(){
        return this.id;
    }

    @Override
    public Aldea getAldea(){
        return this.aldea;
    }

    @Override
    public String getNickname(){
        return this.nickname;
    }

    @Override
    public abstract Magia morir();

    /**
    *Metodo para obtener su ropa.
    */
    public String getRopa(){
        return this.ropa;
    }

    /**
    *Metodo para obtener su arma.
    */
    public String getArma(){
        return this.arma;
    }

    /**
    *Metodo para obtener el cabello.
    */
    public String getCabello(){
        return this.cabello;
    }

    @Override
    public Object clone(){
        Object clone=null;

        try{
            clone=super.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }

        return clone;
    }

    @Override
    public String getDescripcion(){
        return getNickname()+ "con  id"+ id+"con ropa:"+getRopa()+" un arma de tipo:"+getArma() ;
    }
}
