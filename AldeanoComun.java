public class AldeanoComun extends Aldeano{

    /**
    *Metodo para crear hombres lobos con prototype.
    *@return un prototype de lobo.
    */
    public Jugador clone(){
        /**Object clone=null;

        try{
            clone=super.clone;
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;*/
        return null;
    }

    @Override
    public void morir(){

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
