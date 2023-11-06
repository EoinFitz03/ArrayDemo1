package ie.atu;

import java.util.Scanner;

import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {
        int i=0;
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);
        numbers.add(600);
        numbers.add(700);
        numbers.add(800);
        numbers.add(900);
        numbers.add(1000);

        int secondNumber = numbers.get(1);




        for(int number : numbers){

            System.out.println("Element at index "+i+ ":"+ number);
            i++;
        }
        i=0;

        System.out.println("Please Enter a new number ");
        Scanner scanner = new Scanner(System.in);
        numbers.add (scanner.nextInt());

        for(int number : numbers){

            System.out.println("Element at index "+i+ ":"+ number);
            i++;
        }

    }
}