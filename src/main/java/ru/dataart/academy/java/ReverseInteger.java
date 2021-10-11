package ru.dataart.academy.java;

public class ReverseInteger {
    /**
     * @param inputNumber - any integer value
     * @return - inputNumber in reversed order
     * Example: 1234 -> 4321
     * -23 -> -32
     * 120 -> 12
     * -2,147,483,648 -> exception, error message
     */

    public int reverse(int inputNumber) {
        // Представим число в виде массива символов, знак пока что отбросим
        char[] inputAsCharArray = String.format("%d", inputNumber).replace("-", "").toCharArray();
        int size = inputAsCharArray.length;
        char[] outputAsCharArray = new char[size];
        for (int i = 0; i < size; i++) {
            outputAsCharArray[size-1-i] = inputAsCharArray[i];
        }
        try {
            int res = Integer.parseInt(new String(outputAsCharArray));
            return inputNumber>=0 ? res : -res;
        } catch (Exception e) {
            throw new RuntimeException("Введено число, которое не может быть конвертировано.");
        }
    }
}
