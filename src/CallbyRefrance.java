import java.util.Arrays;
import java.util.List;

public class CallbyRefrance {
    public static void main(String args[]) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
      //  list.forEach(integer -> shon(integer));
        list.forEach(CallbyRefrance::shon);
    }

    public static void shon(int i) {
        System.out.println(i * 2);
    }
}