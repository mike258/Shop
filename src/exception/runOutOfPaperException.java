package exception;


/**
 * Created by User on 6/18/2017.
 */
public class runOutOfPaperException extends Exception {
    public static String DEFAULT_MESSAGE =("add paper");
    public runOutOfPaperException(){
    super(DEFAULT_MESSAGE);}

}
