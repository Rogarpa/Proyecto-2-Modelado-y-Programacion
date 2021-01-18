
import java.util.*;

public class MenusJuego implements ObservadorVista{
    public ControladorJuego suscrito;

    public MenusJuego(ControladorJuego aSuscribir){
        aSuscribir.suscribir(this);
    }

    /**
    *Metodo para darle la bienvenida al usuario.
    */
    public void bienvenida(){
        System.out.println("Bienvenidos a la aldea de Castronegro.");
        System.out.println("Ahora mismo hay una maldición de licantropismo entre ustedes.");
        System.out.println(" /\\_______/\\");
        System.out.println(" \\         /");
        System.out.println("  \\ <> <> / ");
        System.out.println(" --\\     /--");
        System.out.println("  --\\   /--");
        System.out.println("     \\O/");
    }

    /**
    *Metodo para que el usuario elija la acción a hacer.
    *@return la acción que quiera realizar.
    */
    public int menuInicial(){
        String opcion,error;
        opcion=
        "Digita la opcion que quieras.\n"+
        "1.-Turorial \n"+
        "2.-Seleccionar Partida \n"+
        "3.-SALIR";
        error="Digite una opción valida";

        return getInputInt(opcion,error,1,3);
    }

    /**
    *Metodo inmediato despues de que el usuario indique que quiera hacer el tutorial.
    *@return la elección del usuario.
    */
    public int tutorial(){
        String error,indicacion;
        indicacion=
        "A continuación las opciones para correr el tutorial. \n"+
        "1.-Juego de 8 \n"+
        "2.-Juego de 12 \n"+
        "3.-Juego de 16 \n"+
        "4.-SALIR";
        error="Digite una opcion valida.";

        return getInputInt(indicacion,error,1,4);
    }

    /**
    *
    *Metodo para desplegar el menu para que el usuario elija el tipo de jeugo.
    *@return el tipo de juego a jugar.
    */
    public int seleccionarTipoJuego(){
        Scanner sc = new Scanner(System.in);
        String indicacion, error;
        indicacion="Digite el número de la opcion de su preferencia y presione enter.\n"+
        "1.-juego1/10   \n"+
        "2.-juego2/15   \n"+
        "3.-juego3/20   \n";
        error = "Digite un tipo de partida correcta.";

        return getInputInt(indicacion, error, 1, 3);
    }

    /**
    *Metodo para cuando ya quiera jugar el usuario.
    *@return el tipo de juego que quiera usar el usuario .
    */
    public void instruccionesTipoJuego(int numeroTipoJuego){
        //necesita más desarrollo de introduccion
        System.out.println("Bienvenida a la aldea");
        String s = "Usted ha escogido el tipo de juego" + numeroTipoJuego + " con capacidad para %s jugadores";
        switch (numeroTipoJuego) {
            case 1:
                System.out.println(s.format(s,10));
                break;
            case 2:
                System.out.println(s.format(s,15));
                break;
            case 3:
                System.out.println(s.format(s,15));
            default:
                break;
        }

        System.out.println("A continuación se solicitarán los nicknames de cada uno de los jugadores.");
    }

    /**
    *Metodo para cuando querramos que el usuario ingrese los nombres de los "jugadores".
    *@return el nombre del jugador.
    */
    public String getNicknameJugadorNuevo(){
        return getInputString("Introduce el Nickname que usarás dentro del juego.", "Nickname invalido");
    }

    /**
    *Metodo para simular las votaciones de la aldea.
    *@return una lista con las votaciones.
    */
    public LinkedList<int[]> getNominacion(){
        boolean flag = true;
        boolean ultimaNominacion = false;
        int[] nominacionActual = new int[2];
        LinkedList<int[]> listaNominaciones = null;

        do{
            if(getInputInt("¿Desea terminar con las nominaciones? \n Digite 0 para salir" , "Opcion Invalida") == 0)
                return listaNominaciones;



            int idNominado = getInputInt("A continuacion digite el id entero del personaje nominado a la hoguera:", "Id invalido");
            int cantidadNominaciones = getInputInt("A continuacion digite el numero de personas que votaron por el mismo: ", "Numero de votaciones invalido") ;

            nominacionActual[0] = idNominado;
            nominacionActual[1] = cantidadNominaciones;

            listaNominaciones.add(nominacionActual);
        }while(true);
    }

    /**
    *Metodo para recibir y manejar cadenas.
    *@param indicacion la indicacion para que el usuario sepa qué digitar.
    *@param error la cadena en caso de que lo ingresado no sea correcto.
    *@return la cadena correcta.
    */
    public String getInputString(String indicacion, String error){
        String entradaNumerica="";

        Scanner scn=new Scanner(System.in);
        do{
            System.out.println(indicacion);
            if(scn.hasNextLine()){
                entradaNumerica=scn.nextLine();
                break;
            }
            else{
                scn.next();
                System.out.println(error);
            }
        }while(true);

        return entradaNumerica;
    }

    /**
    *Metodo para cuando queramos que el usuario elija una opcion entre un rango especifico.
    *@param indicacion la indicacion para que el usuario sepa qué digitar.
    *@param error la cadena en caso de que lo ingresado sea incorrecto.
    *@param enteroMinimo el inicio del intervalo.
    *@param enteroMaximo el final del intervalo.
    *@return el entero correcto.
    */
    public int getInputInt(String indicacion, String error, int enteroMinimo, int enteroMaximo){
        int entradaNumerica=0;

        Scanner scn=new Scanner(System.in);
        do{
            System.out.println(indicacion);
            if(scn.hasNextInt()){
                entradaNumerica=scn.nextInt();
                if(entradaNumerica >= enteroMinimo && entradaNumerica <= enteroMaximo)
                    break;
            }
            else{
                scn.next();
                System.out.println(error);
            }
        }while(true);

        return entradaNumerica;
    }

    /**
    *Metodo para cuando queramos que un usuario ingrese un numero entero solamente.
    *@param indicacion la indicacion para que el usuario sepa qué digitar.
    *@param error la cadena en caso de que lo ingresado sea incorrecto.
    *@return el entero correcto.
    */
    public int getInputInt(String indicacion, String error){
        int entradaNumerica=0;

        Scanner scn=new Scanner(System.in);
        do{
            System.out.println(indicacion);
            if(scn.hasNextInt()){
                entradaNumerica=scn.nextInt();
                break;
            }
            else{
                scn.next();
                System.out.println(error);
            }
        }while(true);

        return entradaNumerica;
    }

    @Override
    public void mostrar(String mensaje){
        System.out.println(mensaje);
    }

    @Override
    public void actualiza(){
        System.out.println("Mensaje de actualización");
    }
}
