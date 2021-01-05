
public class Aldea implements EstadoAldea{

    /**
    *Constructor de la Clase.
    */
    public Aldea(){

    }


    @Override
    public void convocarJuicio(){

    }

    @Override
    public void recuentoNoche(){

    }

    @Override
    public void convocarBanquete(){

    }

    @Override
    public void anochece(){

    }

    @Override
    public void amanece(){

    }

    /**
    *Metodo para matar a alguien en la Aldea.
    *@param aMatar el aldeano a matar.
    *@param asesino el aldeano que mata.
    */
    public void matar(Aldeano aMatar,Aldeano asesino){
        aMatar.morir();
        System.out.println(aMatar.getNickname()+" fue asesinado por "+asesino.getNickname()+"con "+asesino.getArma());
    }
}
