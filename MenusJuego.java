
import java.util.Scanner;

public class MenusUsuario implements ObservadorVista{

    //puedo usar un Scanner único.

    /**
    *Metodo para darle la bienvenida al usuario.
    */
    public void bienvenida(){
        System.out.println("Bienvenidos a la aldea de Castronegro.");
        System.out.println("Ahora mismo hay una maldición de licantropismo entre ustedes.")
        System.out.println(" /\\_______/\\");
        System.out.println(" \\         /");
        System.out.println("  \\ <> <> / ");
        System.out.println(" --\\     /--");
        System.out.println("  --\\   /--");
        System.out.println("     \\O/");
    }

    public int menuInicial(){
        String opcion,error;
        opcion=
        "
        Digita la opcion que quieras.\n
        1.-Turorial \n
        2.-Seleccionar Partida \n
        3.-SALIR
        ";
        error="Digite una opción valida";

        return getInputInt(opcion,error,1,3);
    }

    public void tutorial(){
        String erro,indicacion;
        indicacion=
        "
        A continuación las opciones para correr el tutorial. \n
        1.-Juego de 8 \n
        2.-Juego de 12 \n
        3.-Juego de 16 \n
        4.-SALIR
        "
        error="Digite una opcion valida."

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
        indicacion =
        "Digite el número de la opcion de su preferencia y presione enter.\n
        1.-juego1/10   \n
        2.-juego2/15   \n
        3.-juego3/20   \n";
        error = "Digite un tipo de partida correcta.";

        return getInputInt(indicacion, error, 1, 3);
    }


    public String getNicknameJugadorNuevo(){
        return getInputString("Introduce el Nickname que usarás dentro del juego.", "Nickname invalido");
    }

    public String

    public String getInputString(String indicacion, String error){
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

        return num;
    }

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

        return num;
    }

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

        return num;
    }
}
