import java.util.*;

public class LinkedListEquality {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

        l1.add(1); l1.add(2); l1.add(3);
        l2.add(1); l2.add(2); l2.add(3);

        System.out.println(l1.equals(l2)
                ? "LinkedLists are equal"
                : "LinkedLists are not equal");
    }
}
