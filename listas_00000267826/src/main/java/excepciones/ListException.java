package excepciones;

/**
 * Clase de excepcion lanzada por clases que implementan la interfaz asociada.
 * 
 * 
 * @author 267826
 */
public class ListException extends RuntimeException{

    /**
    * Constructor por omision
    */
    public ListException() {
        super();
    }
    
    /**
    * Constructor que establece un mensaje en la excepción
    *
     * @param mensaje texto que sobreescribir en el mensaje de error
    */
    public ListException(String mensaje) {
        super(mensaje);
    }
}
