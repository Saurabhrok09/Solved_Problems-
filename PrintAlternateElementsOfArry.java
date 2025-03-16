import java.util.stream.IntStream;

public class PrintAlternateElementsOfArry {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 10, 40 };
        int arr1[] = { 64, 34, 25, 12, 22, 11, 90 };

        IntStream.range(0, arr.length).filter(m -> m % 2 == 0).forEach(m ->
        System.out.println(arr[m]));
        System.out.println("Using map");
        IntStream.range(0, arr1.length - 1).filter(m -> m % 2 == 0).map(m -> arr1[m]).forEach(System.out::println);

    }
}