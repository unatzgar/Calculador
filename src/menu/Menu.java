package menu;
import java.util.Scanner;

/**
 * 
 * @author unatz
 *
 */

public class Menu {
    private static Scanner teclado = new Scanner(System.in);
    
    /**
     * @author unatz
     * 
     * @return devuelve un array con los valores introducidos
     */
    
    
    public int[] pedirNumeros(){
        int[] ret = new int[2];
        System.out.print ("Operando 1: ");
        ret [0] = teclado.nextInt();
        System.out.print ("Operando 2: ");
        ret [1] = teclado.nextInt();
        return ret;
    }
    
    /**
     * @author unatz
     * 
     * @apiNote Le pide tipo de operación
     * 
     * @return Devuelve el int
     */
    
    public String menuOpciones() {
        String ret = "";
        do {
            System.out.print ("Operaciones [+, -, *, /, %]: ");
            ret = teclado.next();
        } while (!((ret.equalsIgnoreCase("+")) || (ret.equalsIgnoreCase("-")) ||
                (ret.equalsIgnoreCase("*")) || (ret.equalsIgnoreCase("/")) ||
                (ret.equalsIgnoreCase("%"))
                ));
                return ret;
    }
    
    /**
     * @author unatz
     * 
     * @apiNote Pregunta si quiere continuar trabajando
     * 
     * @return Devuelve el boolean
     */
    
    public boolean repetir(){
        boolean ret = false;
        String respuesta;
        do {
            System.out.print ("¿Desea continuar trabajando con la calculadora? [s / n]");
            respuesta = teclado.next();
        } while (!((respuesta.equalsIgnoreCase("s")) || (respuesta.equalsIgnoreCase("n"))
                    ));
                    
        if (respuesta.equalsIgnoreCase("s")){
            ret = true;
        }
        return ret;
    }
}