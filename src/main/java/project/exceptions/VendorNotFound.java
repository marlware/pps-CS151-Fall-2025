package project.exceptions;

public class VendorNotFound extends Exception{

    private static final long serialVersionUID = 1L;
    public VendorNotFound(){
        super();
    }

    public VendorNotFound(String message){
        super(message);
    }

    public VendorNotFound(String message, Throwable cause){
        super(message, cause);
    }

    public VendorNotFound(Throwable cause){
        super(cause);
    }

}
