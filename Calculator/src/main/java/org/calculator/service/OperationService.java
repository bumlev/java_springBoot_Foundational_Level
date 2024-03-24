package org.calculator.service;

import org.calculator.model.Operation;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OperationService {

    public double calculate(Operation operation) {
        double operand1 = operation.getOperand1();
        double operand2 = operation.getOperand2();
        String operator = operation.getOperator();

        return switch (operator) {
            case "+" -> operand1 + operand2;
            case "-" -> operand1 - operand2;
            case "*" -> operand1 * operand2;
            case "/" -> operand1 / operand2;
            default -> throw new IllegalArgumentException("Invalid operator: " + operator);
        };
    }



}
