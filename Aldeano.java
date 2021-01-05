
public abstract class Aldeano implements Jugador{

    protected String ropa;
    protected String cabello;
    protected String arma;
    protected Aldea aldea;
    protected int id;
    protected String nickname;

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
    public abstract void morir();

    /**
    *Metodo para obtener su ropa.
    */
    public String getRopa(){
        System.out.println(this.ropa);
        return this.ropa;
    }

    /**
    *Metodo para obtener su arma.
    */
    public String getArma(){
        System.out.println(this.arma);
        return this.arma;
    }

    /**
    *Metodo para obtener el cabello.
    */
    public String getCabello(){
        System.out.println(this.cabello);
        return this.cabello;
    }

}
