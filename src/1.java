import java.util.Random;

public class RandomCode {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt((10 - 5) + 1) + 5;
        System.out.println("Number: " + number);
    }
}