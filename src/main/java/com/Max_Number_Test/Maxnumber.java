package com.Max_Number_Test;

public class Maxnumber<T extends Comparable>{
    T[] numbers;

    public Maxnumber(T... numbers){
        this.numbers = numbers;
    }

    public T findMaxNumber()
    {
        return findMaxNumber(this.numbers);
    }

    private static <T extends Comparable> T findMaxNumber(T... numbers){
        T max_Number = numbers[0];
        for ( int i=1; i< numbers.length;i++){
            if( max_Number.compareTo(numbers[i]) < 0){
                max_Number=numbers[i];
            }
        }
        toPrintmaxValue(max_Number);
        return max_Number;
    }

    private static <T extends Comparable> void toPrintmaxValue(T max_number) {
            System.out.println("Maximum Value :"+max_number);
    }
}
