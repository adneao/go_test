import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream.range(1, 101).forEach(number -> {
            boolean isWordOutput = false;
            if (number % 3 == 0) {
                System.out.print("Fizz");
                isWordOutput = true;
            }
            if (number % 5 == 0) {
                System.out.print("Buzz");
                isWordOutput = true;
            }
            if (isWordOutput) {
                System.out.print("\n");
            } else {
                System.out.println(number);
            }
        });
    }
}