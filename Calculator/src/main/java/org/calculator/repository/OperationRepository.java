package org.calculator.repository;

import org.calculator.model.Operation;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OperationRepository {

    private final List<Operation> operations = new ArrayList<>();

    public void addOperation(Operation operation) {
        operations.add(operation);
    }

    public List<Operation> getAllOperations() {
        return operations;
    }
}
