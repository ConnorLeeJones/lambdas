import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;
//import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Double> dubs = Arrays.asList(24.5, 18.3, 90.25, 11.75, 100.0, 65.1);


        System.out.println("evens: " + filterNumbers(ints, x -> x % 2 == 0));
        System.out.println("evens: " + filterNumbers(dubs, x -> x % 2 == 0));

        System.out.println("odds: " + filterNumbers(ints, x -> x % 2 == 1));
        System.out.println("divis by .25: " + filterNumbers(dubs, x -> x % 0.25 == 0));
        System.out.println("divis by .25: " + filterNumbers(ints, x -> x % 0.25 == 0));

    }


    public static <T extends Number> List<T> filterNumbers(List<T> nums, Predicate<T> p){
        return nums.stream().filter(p::test).collect(Collectors.toList());
    }


}
