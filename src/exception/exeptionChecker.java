package exception;

/**
 * Created by User on 6/18/2017.
 */
public class exeptionChecker  {
    public void runOutOfPaper() throws runOutOfPaperException{
        throw new runOutOfPaperException();
    }
    public void technical() throws techicalException{
        throw new techicalException();
    }
}
