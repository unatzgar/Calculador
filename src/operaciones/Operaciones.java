package operaciones;
public class Operaciones{
	
    /**
     * @author unatz
     * Suma los dos numeros que recibe
     * 
     * @param valor1
     * @param valor2
     * @return La suma como número entero
     * @throws
     */
	
    public int sumar (int valor1, int valor2){
        int numero;
        numero = valor1 + valor2;
        return numero;
    }
    
    /**
     * @author unatz
     * Resta los dos numeros que recibe
     * 
     * @param valor1
     * @param valor2
     * @return Resta como número entero
     * @throws
     */
    
    public int restar (int valor1, int valor2){
        int numero;
        numero = valor1 - valor2;
        return numero;
    }
    
    /**
     * @author unatz
     * Multiplica los dos numeros que recibe
     * 
     * @param valor1
     * @param valor2
     * @return Multiplica número entero
     */
    
    public int multiplicar (int valor1, int valor2){
        int numero;
        numero = valor1 * valor2;
        return numero;
    }
    
    /**
     * @author unatz
     * Divide los dos numeros que recibe
     * 
     * @param valor1
     * @param valor2
     * @return Divide número entero
     * @throws ArithmeticException Contemplamos división entre cero
     */
    
    public int dividir (int valor1, int valor2)throws ArithmeticException{
        int numero;
        numero = valor1 / valor2;
        return numero;
    }
    
    /**
     * @author unatz
     * Calcula el resto de los dos numeros que recibe
     * 
     * @param valor1
     * @param valor2
     * @return Resto número entero
     * @throws ArithmeticException Contemplamos división entre cero
     */
    
    public int resto (int valor1, int valor2){
        int numero;
        numero = valor1 % valor2;
        return numero;
    }
}