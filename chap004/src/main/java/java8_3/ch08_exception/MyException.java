package java8_3.ch08_exception;

public class MyException extends Exception {

    private int ERR_CODE;


    public MyException() {
    }

    public MyException(String msg) {
        this(msg, 100);
    }

    MyException(String msg, int errCode) {
        super(msg);
        ERR_CODE = errCode;
    }

    public int getERR_CODE() {
        return ERR_CODE;
    }
}
