package exercises.programming.others;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeFactors {

    public static void main(String args[]) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Give me a number: ");

        int number = reader.nextInt();

        ArrayList<Integer> result = generate(number);

        // Print result
        for (int i = 0; i < result.size(); i++)
            System.out.println(result.get(i));

    }

    public static ArrayList<Integer> generate(int number) {

        ArrayList<Integer> prime_factors = new ArrayList<>();

        for (int i = 2; i < number; i++) {
            boolean prime = true;
            if (number % i == 0) {
                for (int j = 2; j < number; j++) {
                    if (i != j && i % j == 0) {
                        prime = false;
                        break;
                    }
                }
            } else
                prime = false;

            if (prime)
                prime_factors.add(i);
        }

        return prime_factors;

    }
}
