package principal;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

import logs.FiltroLogSoloMultiplicar;
import logs.FormatoHTML;
import logs.LogConsolaMasFichero;
import menu.Menu;
import operaciones.Operaciones;


public class Calculadora{
	private static final LogManager logManager = LogManager.getLogManager();
	private static final Logger LOGGER = Logger.getLogger(Calculadora.class.getName());
	static{
		 try {
			 logManager.readConfiguration(new FileInputStream("./logs/configLog.properties"));
		 } catch (IOException exception) {
			 LOGGER.log(Level.SEVERE, "Error al cargar la configuraci�n",exception);
		 }
	}
    public static void main(String[] args) { 
    	
    	//configurarLog();
    	
        int resultado = 0;
        String operacion = "";
        int[] operandos = new int [2];
        
        Menu menu = new Menu();
        Operaciones operaciones = new Operaciones();
        
        do{
            operandos = menu.pedirNumeros();
            operacion = menu.menuOpciones();
            
            try {
            
            	if (operacion.equalsIgnoreCase("+")){
            		resultado = operaciones.sumar(operandos[0], operandos[1]);
            		System.out.println ("Resultado: " + resultado);
            	} else if (operacion.equalsIgnoreCase("-")){
            		resultado = operaciones.restar(operandos[0], operandos[1]);
            		System.out.println ("Resultado: " + resultado);
            	} else if (operacion.equalsIgnoreCase("*")){
            		resultado = operaciones.multiplicar(operandos[0], operandos[1]);
            		System.out.println ("Resultado: " + resultado);
            	} else if (operacion.equalsIgnoreCase("/")){
            		resultado = operaciones.dividir(operandos[0], operandos[1]);
            		System.out.println ("Resultado: " + resultado);
            	} else if (operacion.equalsIgnoreCase("%")){
            		resultado = operaciones.resto(operandos[0], operandos[1]);
            		System.out.println ("Resultado: " + resultado);
            	} else {
            		System.out.println ("Operaci�n no v�lida");
            	}
            	LOGGER.log(Level.FINE, "Operaci�n: " + operacion + " | operando 1: " + operandos[0] + " | operando 2: " + operandos[1] + " | Resultado: " + resultado);
            }catch(ArithmeticException e) {
        	System.out.println("Operaciones aritmeticas no validas "+ e.getMessage());
        	LOGGER.log(Level.WARNING, "Ha ocurrido un ArithmeticException." ,e);
            }
        }   while (menu.repetir());
        
    }
    
}