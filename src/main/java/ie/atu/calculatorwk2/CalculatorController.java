package ie.atu.calculatorwk2;

//import jdk.dynalink.Operation;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/calculate")
    public CalcResult calculate(@RequestParam double num1, @RequestParam double num2, @RequestParam String operation){

        double sum = 0;
        String operator = "";

        if("add".equals(operation)){
            sum = num1 + num2;
            operator = "add";
        }else if("subtract".equals(operation)){
            sum = num1 - num2;
            operator = "subtract";
        } else if ("multiply".equals(operation)) {
            sum = num1 * num2;
            operator = "multiply";
        } else if ("divide".equals(operation)) {
            if(num2 != 0){
                sum = num1 / num2;
                operator = "divide";
            }else {
                return new CalcResult("divide", "Cannot divide by zero.");
            }
        }   else{
                return new CalcResult("unknown", 00 );
        }
        return new CalcResult(operator, sum);
    }
}
