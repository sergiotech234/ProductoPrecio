//Creamos java exception con un contructor
public class PrecioInvalidoException extends Exception {
    public PrecioInvalidoException(String message) {
        super(message);
    }
}
