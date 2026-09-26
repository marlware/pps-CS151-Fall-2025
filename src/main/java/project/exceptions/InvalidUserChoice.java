package project.exceptions;

public class InvalidUserChoice extends Exception {

    private static final long serialVersionUID = 1L;

    public InvalidUserChoice(){
        super();
    }

    public InvalidUserChoice(String message){
        super(message);
    }

    public InvalidUserChoice(String message, Throwable cause){
        super(message, cause);
    }

    public InvalidUserChoice(Throwable cause){
        super(cause);
    }

}
