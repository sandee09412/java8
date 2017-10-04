import java.util.Arrays;
import java.util.List;

public class JavaITR {
    public static void main(String args[]) {
        List<Integer> list = Arrays.asList(1,3,5,7);
       // list.forEach(i->System.out.println(i));
        //list.forEach(System.out::println);
          list.forEach(i->System.out.println(i));
    }
}