package Atv5;
import java.util.Scanner;
public class SaldoInsuficienteException extends RuntimeException {
    public SaldoInsuficienteException(String errorMessage, Throwable err){
        super(errorMessage, err);
    }
}
