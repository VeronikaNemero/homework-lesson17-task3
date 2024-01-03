import java.util.function.Function;

public class Converter {

    public static void convert(String byn){
        double course = 3.30;

        String[] stringSum = byn.split(" ");

        double sum = Double.parseDouble(stringSum[0]);

        System.out.println("The amount is " + sum + " BYN");

        Function<Double, String> convert = x -> "The amount is " + x + " $";

        System.out.println(convert.apply(sum * course));
    }
}
