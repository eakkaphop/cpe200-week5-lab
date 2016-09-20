package cpe200;


import java.math.BigDecimal;
import java.math.RoundingMode;

public class BinaryCalculator {
    private BigDecimal firstOperand;
    private BigDecimal secondOperand;

    public BinaryCalculator() {
        firstOperand = new BigDecimal(0.0);
        secondOperand = new BigDecimal(0.0);

    }

    public void setFirstOperand(Operand operand) {
        firstOperand = new BigDecimal(operand.getValue());
    }


    public void setSecondOperand(Operand operand) {
        secondOperand = new BigDecimal(operand.getValue());
    }

    public String add() throws RuntimeException {
        if(secondOperand.intValue() < 0 || firstOperand.intValue() < 0)
            throw new RuntimeException("Expect an exception to be thrown before here");
        try{
            return firstOperand.add(secondOperand).stripTrailingZeros().toString();
        }
        catch(RuntimeException ex){
            System.out.println(ex.getMessage());
        }

        return null;
    }

    public String subtract() throws RuntimeException {
        if(secondOperand.intValue() < 0 || firstOperand.intValue() < 0)
            throw new RuntimeException("Expect an exception to be thrown before here");
        try{
            return firstOperand.subtract(secondOperand).stripTrailingZeros().toString();
        }
        catch(RuntimeException ex){
            System.out.println(ex.getMessage());
        }

        return null;

    }

    public String multiply() throws RuntimeException {
        if(secondOperand.intValue() < 0 || firstOperand.intValue() < 0)
            throw new RuntimeException("Expect an exception to be thrown before here");
        try{
            return  firstOperand.multiply(secondOperand).stripTrailingZeros().toString();
        }
        catch(RuntimeException ex){
            System.out.println(ex.getMessage());
        }

        return null;

    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        if(secondOperand.intValue() < 0 || firstOperand.intValue() < 0)
            throw new RuntimeException("Expect an exception to be thrown before here");
        if(secondOperand.intValue() == 0)
            throw new ArithmeticException("The operation must raise an exception");
        try{
            return firstOperand.divide(secondOperand,5, RoundingMode.HALF_UP).stripTrailingZeros().toString();
        }
        catch(RuntimeException ex){
            System.out.println(ex.getMessage());
        }

        return null;

    }

    public String power() throws RuntimeException {
        if(secondOperand.intValue() < 0 || firstOperand.intValue() < 0)
            throw new RuntimeException("Expect an exception to be thrown before here");

        try{
            return new BigDecimal(String.valueOf( Math.pow( Double.parseDouble(firstOperand.toString()), Double.parseDouble(secondOperand.toString())))).stripTrailingZeros().toString();

        }
        catch(RuntimeException ex){
            System.out.println(ex.getMessage());
        }

        return null;

        }

}
