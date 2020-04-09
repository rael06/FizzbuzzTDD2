import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

public class FizzBuzz implements IFizzBuzz {
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZ_BUZZ = "Fizzbuzz";
    private static final int INCLUDE_END_TO_RANGE_OF_NUMBERS = 1;
    private int[] numbers;

    @Override
    public boolean isFizz(int i) {
        return i % 3 == 0;
    }

    @Override
    public boolean isBuzz(int i) {
        return i % 5 == 0;
    }

    @Override
    public boolean isFizzBuzz(int i) {
        return i % 15 == 0;
    }

    @Override
    public String process(int i) {
        if (i == 0) return 0 + "";
        if (isFizzBuzz(i)) return FIZZ_BUZZ;
        if (isBuzz(i)) return BUZZ;
        if (isFizz(i)) return FIZZ;
        return i + "";
    }

    @Override
    public void initNumbers(int n) {
        numbers = new int[n];
        for (int i = 0; i < n; i++)
            numbers[i] = i + 1;
    }

    @Override
    public void initRangeOfNumbers(int start, int end) {
        int range = end - start + INCLUDE_END_TO_RANGE_OF_NUMBERS;
        numbers = new int[range];
        for (int i = 0; i < range; i++)
            numbers[i] = i + start;
    }

    @Override
    public String write() {
        StringJoiner stringJoiner = new StringJoiner("\n");
        Arrays.stream(numbers).forEach(n -> stringJoiner.add(process(n)));
        return stringJoiner.toString();
    }

    @Override
    public String writeLine() {
        StringBuilder stringBuilder = new StringBuilder();
        Arrays.stream(numbers).forEach(n -> stringBuilder.append(process(n)));
        return stringBuilder.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Entrez un nombre de depart : ");
            int start = Integer.parseInt(sc.nextLine());

            System.out.println("Entrez un nombre de fin : ");
            int end = Integer.parseInt(sc.nextLine());

            IFizzBuzz fizzBuzz = new FizzBuzz();

            fizzBuzz.initRangeOfNumbers(start, end);
            System.out.println("-----");
            System.out.println(fizzBuzz.write());
            System.out.println("-----");
            System.out.println(fizzBuzz.writeLine());
            System.out.println("-----");
        } catch (NumberFormatException e) {
            System.out.println("Erreur, vous n'avez pas entre un nombre");
        }
    }
}
