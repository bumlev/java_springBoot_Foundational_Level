package org.calculator.controller;

import org.calculator.model.Operation;
import org.calculator.repository.OperationRepository;
import org.calculator.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/operations")
public class CalculatorController {

    @Autowired
    private OperationRepository operationRepository;

    @Autowired
    private OperationService operationService;

    @PostMapping( "/calculate")
    public double calculate(@RequestBody Operation operation) {

        double result = operationService.calculate(operation);
        operation.setResult(result);
        operationRepository.addOperation(operation);
        return result;
    }

    @GetMapping("/")
    public List<Operation> getAllOperations() {
        return operationRepository.getAllOperations();
    }

}
