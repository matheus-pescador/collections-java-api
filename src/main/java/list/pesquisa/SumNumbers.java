package main.java.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SumNumbers {
    private List<Integer> numbers;

    public SumNumbers() {
        this.numbers = new ArrayList<>();
    }

    public void addNumber(int number) {
        numbers.add(number);
    }

    public int calculateSum() {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }

    public int findBiggestNumber() {
        int biggestNumber = Integer.MIN_VALUE;
        if (!numbers.isEmpty()) {
            for (Integer number : numbers) {
                if (number >= biggestNumber) {
                    biggestNumber = number;
                }
            }
            return biggestNumber;
        } else {
            throw new RuntimeException("The list is empty!");
        }
    }

    public int findSmallestNumber() {
        int lowestNumber = Integer.MAX_VALUE;
        if (!numbers.isEmpty()) {
            for (Integer number : numbers) {
                if (number <= lowestNumber) {
                    lowestNumber = number;
                }
            }
            return lowestNumber;
        } else {
            throw new RuntimeException("The list is empty!");
        }
    }

    public void showNumbers() {
        if (!numbers.isEmpty()) {
            System.out.println(this.numbers);
        } else {
            System.out.println("The list is empty!");
        }
    }

    public static void main(String[] args) {
        SumNumbers sumNumbers = new SumNumbers();

        sumNumbers.addNumber(5);
        sumNumbers.addNumber(0);
        sumNumbers.addNumber(0);
        sumNumbers.addNumber(-2);
        sumNumbers.addNumber(10);


        System.out.println("Added numbers: ");
        sumNumbers.showNumbers();

        System.out.println("Sum: " + sumNumbers.calculateSum());

        System.out.println("Biggest number: " + sumNumbers.findBiggestNumber());

        System.out.println("Smallest number: " + sumNumbers.findSmallestNumber());

    }
}

