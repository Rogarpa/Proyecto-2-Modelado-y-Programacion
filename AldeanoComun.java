public class AldeanoComun extends Aldeano{

    /**
    *Metodo para crear hombres lobos con prototype.
    *@return un prototype de lobo.
    */
    public AldeanoComun clone(){
        /**Object clone=null;

        try{
            clone=super.clone;
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;*/
        return new AldeanoComun();
    }

    @Override
    public Magia morir(){
        return null;
    }

    /**
    *Constructor de la clase.
    */
    public AldeanoComun(){
        cabello="Peinado hacia atras.";
        arma="Lanza de Madera";
        ropa="Camisa de Seda, pantalones hilados de algodón.";
    }
}
