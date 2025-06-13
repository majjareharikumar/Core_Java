package Java8.coding;
// Find all numbers starting with 1 using Stream functions
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartsWithOne {
    public static void main(String[] args) {
        List<Integer> numbser= Arrays.asList(12,2,13,4,1,515,122);

        List<String> startsWithOne =numbser.stream()
                .map(String::valueOf)
                .filter(n->n.startsWith("1"))
                .collect(Collectors.toList());

        System.out.println("Numbers start with 1:- "+startsWithOne);
    }
}
