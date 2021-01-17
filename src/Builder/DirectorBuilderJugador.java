
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
        Lobo personajeAConstruir = new Lobo();

        personajeAConstruir.setId(id);
        personajeAConstruir.setNickname(nickname);
        personajeAConstruir.setAldea(aldeaHogar);

        builderActual.setArma("Garras y dientes afilados.");
        builderActual.setRopa("Pelaje negro intenso.");
        builderActual.setCabello("Pelaje facial y bigotes rojos de sangre.");
        builderActual.setAldea(aldeaHogar);
    }

    /**
    *Metodo para cuando queramos crear un aldeano comun.
    *@param id el id del aldeano.
    *@param nickname el nombre del aldeano.
    *@param aldeaHogar la aldea a la que pertenece.
    */
    public void creaAldeanoComun(int id, String nickname, Aldea aldeaHogar){
        AldeanoComun personajeAConstruir = new AldeanoComun();

        personajeAConstruir.setId(id);
        personajeAConstruir.setNickname(nickname);
        personajeAConstruir.setAldea(aldeaHogar);

        builderActual.setArma("Lanza de madera con punta de hierro.");
        builderActual.setRopa("Camisa, chaleco y pantalon de algodon.");
        builderActual.setCabello("Rubio peinado de lado.");
        builderActual.setAldea(aldeaHogar);
    }

    /**
    *Metodo para cuando queramos crear al Angel.
    *@param id el id del aldeano.
    *@param nickname el nombre del aldeano.
    *@param aldeaHogar la aldea a la que pertenece.
    */
    public void creaAngel(int id, String nickname, Aldea aldeaHogar,Aldeano victima){
        Angel personajeAConstruir = Angel.getinstance(victima);

        personajeAConstruir.setId(id);
        personajeAConstruir.setNickname(nickname);
        personajeAConstruir.setAldea(aldeaHogar);

        builderActual.setArma("Espada bendita con mango de oro.");
        builderActual.setRopa("Toga blanca, pero entre aldeanos usa lo mismo que el aldeano común.");
        builderActual.setCabello("Blanco hacia atras..");
        builderActual.setAldea(aldeaHogar);
    }

    /**
    *Metodo para cuando querramos crear a la Vidente.
    *@param id el id del aldeano.
    *@param nickname el nombre del aldeano.
    *@param aldeaHogar la aldea a la que pertenece.
    */
    public void creaVidente(int id, String nickname, Aldea aldeaHogar,Aldeano victima){
        Vidente personajeAConstruir = Vidente.getinstance(victima);

        personajeAConstruir.setId(id);
        personajeAConstruir.setNickname(nickname);
        personajeAConstruir.setAldea(aldeaHogar);

        builderActual.setArma("Ninguna, solo una bola de cristal.");
        builderActual.setRopa("Holzkary moderno, tradicional gitano.");
        builderActual.setCabello("Desconocido, trae un turbante.");
        builderActual.setAldea(aldeaHogar);
    }

    /**
    *Metodo para cuando queramos crear al Cazador.
    *@param id el id del aldeano.
    *@param nickname el nombre del aldeano.
    *@param aldeaHogar la aldea a la que pertenece.
    */
    public void creaCazador(int id, String nickname,Aldea aldeaHogar,Aldeano victima){
        Cazador personajeAConstruir =Cazador.getinstance(victima);

        personajeAConstruir.setId(id);
        personajeAConstruir.setNickname(nickname);
        personajeAConstruir.setAldea(aldeaHogar);

        builderActual.setArma("Rifle de candado.");
        builderActual.setRopa("Chamarra de lana y pantalon de lana también.");
        builderActual.setCabello("Negro, tapado por sombrero bombardero ruso.");
        builderActual.setAldea(aldeaHogar);
    }

    /**
    *Metodo para cuando querramos crear al Caballero.
    *@param id el id del aldeano.
    *@param nickname el nombre del aldeano.
    *@param aldeaHogar la aldea a la que pertenece.
    */
    public void creaCaballero(int id, String nickname,Aldea aldeaHogar,Aldeano victima ){
        Caballero personajeAConstruir = Caballero.getinstance(victima);

        personajeAConstruir.setId(id);
        personajeAConstruir.setNickname(nickname);
        personajeAConstruir.setAldea(aldeaHogar);

        builderActual.setArma("Espada oxidada con Rosa de los vientos.");
        builderActual.setRopa("Armadura de hierro templado.");
        builderActual.setCabello("Desconocido por el casco.");
        builderActual.setAldea(aldeaHogar);
    }

}
