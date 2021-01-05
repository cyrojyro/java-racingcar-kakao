package calculator.domain;

import calculator.io.Input;
import calculator.io.Output;

import java.util.List;

public class Calculator {
    public static void addIO() {
        Output.askInput();
        Output.printResult(add(Input.getCalculatorInput()));
    }

    public static int add(List<Integer> inputIntegers) {
        return inputIntegers.stream()
                .mapToInt(Integer::valueOf)
                .sum();
    }
}