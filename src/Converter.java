import java.util.function.Function;
import java.util.function.Consumer;

public class Converter {

    public static final double COURSE = 3.30;

    public static void convertFunction(String byn){
        String[] stringSum = byn.split(" ");

        double sum = Double.parseDouble(stringSum[0]);

        System.out.println("The amount is " + sum + " BYN");

        Function<Double, String> convert = x -> "The amount is " + x + " $";

        System.out.println(convert.apply(sum * COURSE));
    }

    public static void convertConsumer(String byn){
        String[] stringSum = byn.split(" ");

        double sum = Double.parseDouble(stringSum[0]);

        System.out.println("The amount is " + sum + " BYN");

        Consumer<Double> printer = x-> System.out.println("The amount is " + x + " $");

        printer.accept(sum * COURSE);
    }
}
