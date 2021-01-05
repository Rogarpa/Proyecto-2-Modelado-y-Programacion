
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
