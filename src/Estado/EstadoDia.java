import java.util.LinkedList;

import src.Aldea.Aldea;

public class EstadoDia implements EstadoAldea{

    protected Aldea narrador;

    /**
    *Constructor de la Clase.
    *@param narrador la aldea donde es de dia.
    */
    public EstadoDia(Aldea narrador){
        this.narrador=narrador;
    }

    @Override
    public void convocarJuicio(){
        narrador.getControladorAldea().muestra("Tras las muertes de anoche es necesario un linchamiento:");
        LinkedList<int[]> idsNominaciones = narrador.getControladorAldea().obtenerCorrelacionIdsNominaciones();
        int idMaximo;
        int nominacionesIdMaximo = 0;
        for(int[] i : idsNominaciones){
            if(i[1] > nominacionesIdMaximo){
                idMaximo = i[0];
                nominacionesIdMaximo = i[1];
            }
        }

        narrador.linchar(idMaximo);
    }

    @Override
    public void recuentoNoche(){
        narrador.getControladorAldea().muestra("A continuación los aldeanos encontrados muertos.");
        for(Jugador j: narrador.getMuertosUltimaNoche())
            narrador.getControladorAldea().muestra(j.getDescripcion());

    }

    @Override
    public void convocarBanquete(){
        narrador.getControladorAldea().publicar("Ya ocurrio la noche pasada.");
        throw new UnsupportedOperationException("Acción no disponible para la aldea");

    }

    @Override
    public void anochece(){
        narrador.getControladorAldea().publicar("Se está ocultando el sol.");
        narrador.setEstadoActual(narrador.getAnocheciendo());
    }

    @Override
    public void amanece(){
        narrador.getControladorAldea().publicar("Ya es de día.");
        throw new UnsupportedOperationException("Acción no disponible para la aldea");
    }
}
