package Java8.coding;
// Sort a list of strings by length using Java 8.
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortByLength {
    public static void main(String[] args) {

        List<String> name= Arrays.asList("Hari","Ram","Krishna","Mani","Kumar");

        List<String> Sortednames=name.stream().sorted((s1,s2)->s1.length()-s2.length()).collect(Collectors.toList());
        System.out.println(Sortednames);
    }
}
