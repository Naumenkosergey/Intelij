package calculator;

import java.util.Scanner;

public abstract class Variable implements IOperation {

    @Override
    public Variable slogenie(Variable other) {
        System.out.println("Сложение " + this + " + " + other + " невозможно");
        return null;
    }

    @Override
    public Variable vichitanie(Variable other) {
        System.out.println("Вычитание " + this + " - " + other + " невозможно");
        return null;
    }

    @Override
    public Variable umnogenie(Variable other) {
        System.out.println("Умножение " + this + " * " + other + " невозможно");
        return null;
    }

    @Override
    public Variable delenie(Variable other) {
        System.out.println("Деление " + this + " / " + other + " невозможно");
        return null;
    }

    public static Variable createVar(String apparand) {
        if (apparand.matches(Patterns.SCALAR))
            return new Scalar(apparand);
        if (apparand.matches(Patterns.VECTOR))
            return new Vector(apparand);
        if (apparand.matches(Patterns.MATRIX))
            return new Matrix(apparand);


        return null;
    }
}
