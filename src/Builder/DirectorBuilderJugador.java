class DirectorBuilderJugador{
    protected BuilderJugador builderActual;
    protected Jugador personajeAConstruir;


    Director(BuilderJugador tipoBuilder){

    }

    public void cambiarBuilder(BuilderJugador tipoBuilder){
        builderActual = tipoBuilder;
    }

    public void creaLobo(int id, String nickname, String aldeaHogar){}
    public void creaAldeanoComun(int id, String nickname, String aldeaHogar){}
    public void creaAngel(int id, String nickname, String aldeaHogar){}
    public void creaVidente(int id, String nickname, String aldeaHogar){}
    public void creaCazador(int id, String nickname, String aldeaHogar){}
    public void creaCaballero(int id, String nickname, String aldeaHogar){}

}
