package org.example;

public class Calc {
    public double add(Object a, Object b){
        double num1=parseToDouble(a);
        double num2=parseToDouble(b);

        return num1+num2;
    }
    private double parseToDouble(Object val){
        if(val instanceof Number)
            return ((Number) val).doubleValue();

        if(val instanceof String){
            try{
                return Double.parseDouble((String) val);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Enter numbers only");
            }
        }
        throw new IllegalArgumentException("Enter numbers only");
    }
}
