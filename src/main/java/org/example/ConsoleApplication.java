package org.example;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class ConsoleApplication implements Application {
    private final ConsoleReader reader;
    private final ConsoleWriter writer;
    private final OperationService operationService;
    private final Logger log = Logger.getLogger("");

    public ConsoleApplication(ConsoleReader reader, ConsoleWriter writer, OperationService operationService) {
        this.reader = reader;
        this.writer = writer;
        this.operationService = operationService;
    }



    @Override
    public void run() {
        log.log(Level.INFO,"Test");
        writer.write("Enter num1");
        double num1 = reader.readDouble();
        log.log(Level.WARNING,"Test1");
        writer.write("Enter num2");
        double num2 = reader.readDouble();
        log.log(Level.INFO,"Test2");
        writer.write("Enter type");
        String type = reader.readString();
        switch(type){
            case "sum":
                SumOperation sumOperation = new SumOperation(num1, num2);
                Operation calc1 = operationService.calc(sumOperation);
                writer.write("Result = " + calc1.getResult());
                break;
            case "sub":
                SubOperation subOperation = new SubOperation(num1, num2);
                Operation calc2 = operationService.calc(subOperation);
                writer.write("Result" + calc2.getResult());
                break;
        }

    }
}
