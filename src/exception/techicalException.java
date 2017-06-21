package exception;

/**
 * Created by User on 6/18/2017.
 */
public class techicalException extends Exception {
    public static String DEFAULT_MESSAGE = "fix me";
    public techicalException(){
        super(DEFAULT_MESSAGE);
    }
}
