class DirectorBuilderJugador{
    protected BuilderJugador builderActual;
    protected Aldeano personajeAConstruir;

    /**
    *Constructor de la clase.
    *@param tipoBuilder el tipo de builder.
    */
    DirectorBuilderJugador(BuilderJugador tipoBuilder){

    }

    /**
    *Metodo para cuando querramos cambiar el tipo de Builder a otro.
    *@param tipoBuilder el tipo de builder al cual cambiar.
    */
    public void cambiarBuilder(BuilderJugador tipoBuilder){
        builderActual = tipoBuilder;
    }

    /**
    *Metodo para cuando queramos crear un Lobo.
    *@param id el id del aldeano.
    *@param nickname el nombre del aldeano.
    *@param aldeaHogar la aldea a la que pertenece.
    */
    public void creaLobo(int id, String nickname, Aldea aldeaHogar){
        BuilderAldeano builder=new BuilderAldeano(id,nickname,aldeaHogar);
        builder.setArma("Garras y dientes afilados.");
        builder.setRopa("Pelaje negro intenso.");
        builder.setCabello("Pelaje facial y bigotes rojos de sangre.");
        builder.setAldea(aldeaHogar);
    }

    /**
    *Metodo para cuando queramos crear un aldeano comun.
    *@param id el id del aldeano.
    *@param nickname el nombre del aldeano.
    *@param aldeaHogar la aldea a la que pertenece.
    */
    public void creaAldeanoComun(int id, String nickname, Aldea aldeaHogar){
        BuilderAldeano builder=new BuilderAldeano(id,nickname,aldeaHogar);
        builder.setArma("Lanza de madera con punta de hierro.");
        builder.setRopa("Camisa, chaleco y pantalon de algodon.");
        builder.setCabello("Rubio peinado de lado.");
        builder.setAldea(aldeaHogar);
    }

    /**
    *Metodo para cuando queramos crear al Angel.
    *@param id el id del aldeano.
    *@param nickname el nombre del aldeano.
    *@param aldeaHogar la aldea a la que pertenece.
    */
    public void creaAngel(int id, String nickname, Aldea aldeaHogar){
        BuilderAldeano builder=new BuilderAldeano(id,nickname,aldeaHogar);
        builder.setArma("Espada bendita con mango de oro.");
        builder.setRopa("Toga blanca, pero entre aldeanos usa lo mismo que el aldeano común.");
        builder.setCabello("Blanco hacia atras..");
        builder.setAldea(aldeaHogar);
    }

    /**
    *Metodo para cuando querramos crear a la Vidente.
    *@param id el id del aldeano.
    *@param nickname el nombre del aldeano.
    *@param aldeaHogar la aldea a la que pertenece.
    */
    public void creaVidente(int id, String nickname, Aldea aldeaHogar){
        BuilderAldeano builder=new BuilderAldeano(id,nickname,aldeaHogar);
        builder.setArma("Ninguna, solo una bola de cristal.");
        builder.setRopa("Holzkary moderno, tradicional gitano.");
        builder.setCabello("Desconocido, trae un turbante.");
        builder.setAldea(aldeaHogar);
    }

    /**
    *Metodo para cuando queramos crear al Cazador.
    *@param id el id del aldeano.
    *@param nickname el nombre del aldeano.
    *@param aldeaHogar la aldea a la que pertenece.
    */
    public void creaCazador(int id, String nickname,Aldea aldeaHogar){
        BuilderAldeano builder=new BuilderAldeano(id,nickname,aldeaHogar);
        builder.setArma("Rifle de candado.");
        builder.setRopa("Chamarra de lana y pantalon de lana también.");
        builder.setCabello("Negro, tapado por sombrero bombardero ruso.");
        builder.setAldea(aldeaHogar);
    }

    /**
    *Metodo para cuando querramos crear al Caballero.
    *@param id el id del aldeano.
    *@param nickname el nombre del aldeano.
    *@param aldeaHogar la aldea a la que pertenece.
    */
    public void creaCaballero(int id, String nickname,Aldea aldeaHogar){
        BuilderAldeano builder=new BuilderAldeano(id,nickname,aldeaHogar);
        builder.setArma("Espada oxidada con Rosa de los vientos.");
        builder.setRopa("Armadura de hierro templado.");
        builder.setCabello("Desconocido por el casco.");
        builder.setAldea(aldeaHogar);
    }

}
