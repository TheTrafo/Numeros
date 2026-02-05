/*
    Write a program called Numeros to display the first 21 numbers F(n), where F(n)=F(n–1)+F(n–2) and F(0)=0, F(1)=F(2)=1. Also compute their mean and median.
    The output shall look like:
    0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
    The mean is 843.33
    The median is 55
*/

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int i, first = 0, second = 1;
        final int amountN = 21;

        double aggregate = 0;
        List<Double> numbers = new ArrayList<>(amountN);

        for(i=0; i < amountN; i++){
            System.out.print(first + " ");
            numbers.add((double) first);
            aggregate += first;

            int third = second + first;
            first = second;
            second = third;
        }
        double mean = aggregate/amountN;
        System.out.printf("\nThe mean is %.2f", mean);

        int middle = numbers.size() / 2;
        double median;

        if(numbers.size() % 2 == 0){
            median = (numbers.get(middle - 1) + numbers.get(middle)) / 2;
        } else {
            median = numbers.get(middle);
        }
        System.out.printf("\nThe median is %.2f", median);
    }

}
