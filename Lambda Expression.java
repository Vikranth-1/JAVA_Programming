import java.util.*;

class LambdaSort {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 2, 9, 1, 7);

        list.sort((a, b) -> b - a);

        System.out.println(list);
    }
}
