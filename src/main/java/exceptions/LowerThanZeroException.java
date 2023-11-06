package exceptions;

public class LowerThanZeroException extends IllegalArgumentException{
    public LowerThanZeroException(){
        super("Valore inserito minore o uguale a 0.");
    }
}
