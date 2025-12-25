import java.util.*;

public class KthSmallest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(2);
        list.add(9);
        list.add(4);
        list.add(1);

        int k = 3;
        Collections.sort(list);
        System.out.println("Kth smallest element: " + list.get(k - 1));
    }
}
