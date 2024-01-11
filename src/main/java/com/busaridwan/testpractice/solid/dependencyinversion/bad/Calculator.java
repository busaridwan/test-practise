package com.busaridwan.testpractice.solid.dependencyinversion.bad;

import com.busaridwan.testpractice.solid.openclosed.OperationEnum;

public class Calculator {
    // High-level module (calculate) is dependent on Lower-level modules (sub, add)
    public int calculate(int a, int b, OperationEnum operation){
        int result = 0;
        switch (operation){
            case ADD -> {
                AddOperation add = new AddOperation();
                result = add.add(a,b);
            }
            case SUB -> {
                SubOperation sub = new SubOperation();
                result = sub.sub(a,b);
            }
        }
        return result;
    }
}
