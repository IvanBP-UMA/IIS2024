package org.iis2024.factorial;

public class FactorialException extends RuntimeException{
    public FactorialException(){
        super();
    }

    public FactorialException(String err){
        super(err);
    }
}
