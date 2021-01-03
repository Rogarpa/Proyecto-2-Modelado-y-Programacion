
public class main{
    public static void main(String[] args){

        Aldeano uno=new AldeanoComun();
        Aldeano moni=Vidente.getinstance();
        Aldeano dos=Cazador.getinstance();
        Aldeano tres=Caballero.getinstance();

        uno.getArma();
        moni.getRopa();
        dos.getCabello();
        tres.getId();
    }
}
