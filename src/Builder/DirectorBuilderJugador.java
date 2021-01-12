class DirectorBuilderJugador{
    protected BuilderJugador builderActual;
    protected Jugador personajeAConstruir;


    Director(BuilderJugador tipoBuilder){

    }

    public void cambiarBuilder(BuilderJugador tipoBuilder){
        builderActual = tipoBuilder;
    }

    public Lobo creaLobo(int id, String nickname, String aldeaHogar){}
    public AldeanoComun  creaAldeanoComun(int id, String nickname, String aldeaHogar){}
    public Angel creaAngel(int id, String nickname, String aldeaHogar){}
    public Vidente creaVidente(int id, String nickname, String aldeaHogar){}
    public Cazador creaCazador(int id, String nickname, String aldeaHogar){}
    public Caballero creaCaballero(int id, String nickname, String aldeaHogar){}

}
