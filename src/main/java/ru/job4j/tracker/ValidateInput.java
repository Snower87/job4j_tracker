package ru.job4j.tracker;

public class ValidateInput implements Input {
    private final Output out;
    private final Input in;

    public ValidateInput(Output out, Input in) {
        this.out = out;
        this.in = in;
    }

    @Override
    public String askStr(String question) {
        return in.askStr(question);
    }

    private boolean isNumber(String value) {
        boolean rsl = true;
        char[] check = value.toCharArray();
        for (char num : check) {
            if (num < 48 || num > 57) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    @Override
    public int askInt(String question) {
        boolean invalid = true;
        int value = -1;
        //Вариант №1 - обработка событий через исключение
        do {
            try {
                value = in.askInt(question);
                invalid = false;
            } catch (NumberFormatException nfe) {
                out.println("Please enter validate data again.");
            }
        //Вариант №2 - проверка входных условий через if + метод isNumber()
        //do {
        //    String rsl = in.askStr(question);
        //    if (!isNumber(rsl)) {
        //        System.out.println("Please enter validate data again.");
        //        continue;
        //    }
        //    value = Integer.parseInt(rsl);
        //    invalid = false;
        } while (invalid);
        return value;
    }

    @Override
    public int askInt(String question, int max) {
        return 0;
    }
}
