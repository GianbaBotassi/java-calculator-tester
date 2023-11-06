package exceptions;

public class DivideByZeroException extends Exception{
    public DivideByZeroException(){
        super("Il valore non può essere uguale zero.");
    }
}
