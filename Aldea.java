public class Aldea{

    public void matar(Aldeano aMatar,Aldeano asesino){
        aMatar.morir();
        System.out.println(aMatar.getNickname()+" fue asesinado por "+/**asesino.getNickname()*/+"con "+asesino.getArma());
    }
}
