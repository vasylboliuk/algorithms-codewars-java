package org.tasks.kyu7;

/**
 * Created by vboliuk on 30.12.2016.
 */
public class MakeAFunctionThatDoesArithmetic {

    /*
    Description:
    Given two numbers and an arithmetic operator (the name of it, as a string), return the result of the two numbers having that operator used on them.
    a and b will both be positive integers, and a will always be the first number in the operation, and b always the second.
    The four operators are "add", "subtract", "divide", "multiply".
    A few examples:
    arithmetic(5, 2, "add") should return 7
    arithmetic(5, 2, "subtract") should return 3
    arithmetic(5, 2, "multiply") should return 10
    arithmetic(5, 2, "divide") should return 2.5
    -- In Haskell:
    -- 1. The operation is defined as
    data Operation = Add | Divide | Multiply | Subtract deriving (Eq, Show, Enum, Bounded)
    -- 2. The arithmetic function as
    arithmetic :: Double -> Double -> Operation -> Double
    Try to do it without using if statements!
    */
    public static int arithmetic(int a, int b, String operator) {

        int result;
        switch (operator) {
            case "add":
                result = a + b;
                break;
            case "subtract":
                result = a - b;
                break;
            case "multiply":
                result = a * b;
                break;
            case "divide":
                result = a / b;
                break;
            default:
                result = 0;
                break;
        }
        return result;
    }
}
