package ie.atu.calculatorwk2;

public class CalcResult {
    private String operation;
    private int result;

    public CalcResult(String operation, int result) {
        this.operation = operation;
        this.result = result;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
