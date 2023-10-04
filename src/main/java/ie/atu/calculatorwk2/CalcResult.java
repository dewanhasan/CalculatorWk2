package ie.atu.calculatorwk2;

public class CalcResult {
    private String operation;
    private double result;


    public CalcResult(String operation, double result) {
        this.operation = operation;
        this.result = result;


    }


    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

}
