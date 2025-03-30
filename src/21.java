import java.util.Random;

public class RandomCodeGenerator {

    private static final int MAX_RANDOM_NUMBER = 100;
    private static final int MIN_RANDOM_NUMBER = 0;
    private static final Random random = new Random();

    public void generateRandomNumber() {
        int randomNumber = random.nextInt(MAX_RANDOM_NUMBER - MIN_RANDOM_NUMBER + 1) + MIN_RANDOM_NUMBER;
        System.out.println("Generated random number: " + randomNumber);
    }

    public static void main(String[] args) {
        RandomCodeGenerator generator = new RandomCodeGenerator();
        generator.generateRandomNumber();
    }
}
