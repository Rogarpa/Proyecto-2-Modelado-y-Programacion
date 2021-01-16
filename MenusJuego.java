
import java.util.Scanner;

public class MenusUsuario implements ObservadorVista{
    
    //puedo usar un Scanner único.
    
    
    public void bienvenida(){
        System.out.println("Mensaje de bienvenida");
    }

    public int menuInicial(){
        System.out.println("opciones para iniciar juego incluido tutorial");
    }
    public void tutorial(){
        System.out.println("Imprimir tutorial o simulacion");
    }
    
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
