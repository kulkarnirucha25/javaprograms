package ExceptionHandlingDemo;

public class Calculator {

    public int divide(int a,int b)
    throws DivisionException{

        if(b == 0)
            throw new DivisionException("Cannot Divide by Zero");

        return a/b;
    }

}