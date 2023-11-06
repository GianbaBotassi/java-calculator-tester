package Model;

import exceptions.DivideByZeroException;

public class Calculator {
    //methods
    public static float add(float num1, float num2){
        return num1 + num2;
    }
    public static float substract(float num1, float num2){
        return num1 - num2;
    }
    public static float divide(float num1, float num2) throws DivideByZeroException {
        if(num2 == 0){
            throw new DivideByZeroException();
        }
        return num1 / num2;
    }
    public static float multiply(float num1, float num2){
        return num1 * num2;
    }
}
