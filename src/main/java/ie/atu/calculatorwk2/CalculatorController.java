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
    public CalcResult calculate(@RequestParam int num1, @RequestParam int num2, @RequestParam String operation){

        int sum = 0;
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
        }
        /*else{
            return new CalcResult("unknown", );
        }*/

        return new CalcResult(operator, sum);

    }


}
