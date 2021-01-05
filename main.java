
public class main{
    public static void main(String[] args){

        Aldea primera=new Aldea();
        Aldeano uno=new AldeanoComun();
        Aldeano moni=Vidente.getinstance();
        Aldeano dos=Cazador.getinstance();
        Aldeano tres=Caballero.getinstance();
        Aldeano cuatro=new Lobo();
        Aldeano cinco=Angel.getinstance();

        Magia magia=new MagiaCazador(tres,primera);

        uno.getArma();
        moni.getRopa();
        dos.getCabello();
        tres.getId();
        cuatro.getRopa();
        uno.getCabello();
        moni.getArma();
        dos.getCabello();
        tres.getArma();
        cuatro.getArma();

        primera.matar(dos,cuatro);



    }
}
