package com.jmendoza.lambda.passedaround;

import java.util.function.Function;

public class TaskImpl implements Task {
    @Override
    public String execute(Function<String, String> function) {
        return function.apply("TaskImpl");
    }
}
