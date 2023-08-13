import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            int num = random.nextInt(1,100);
            numbers.add(num);
        }

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();


        for (int num : numbers) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }
        for (int num : numbers) {
            if (num % 2 != 0){
                oddNumbers.add(num);
            }

        }
        System.out.println("Четные числа:");
        for (int evenNum : evenNumbers) {
            System.out.println(evenNum);
        }
    }
}
