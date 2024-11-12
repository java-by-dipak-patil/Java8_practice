import java.util.Date;
import java.util.function.Supplier;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Supplier<Date> s=()->new Date();
        System.out.println(s.get());

    }
}