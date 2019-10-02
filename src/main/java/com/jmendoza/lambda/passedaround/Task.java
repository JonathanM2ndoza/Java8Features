package com.jmendoza.lambda.passedaround;

import java.util.function.Function;

public interface Task {
    String execute(Function<String, String> function);
}
