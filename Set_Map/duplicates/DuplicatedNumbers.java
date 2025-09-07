import java.util.*;

public class DuplicatedNumbers {
    public static TreeSet<Integer> isFind(int[] integers) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        Set<Integer> hasSet = new HashSet<>();

        for (int integer : integers) {
            if (hasSet.contains(integer)) {
                treeSet.add(integer);
            }else{
                hasSet.add(integer);
            }
        }
        return treeSet;
    }
}
