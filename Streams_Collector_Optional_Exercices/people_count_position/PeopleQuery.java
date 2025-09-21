import java.util.*;
import java.util.stream.Collectors;

public class PeopleQuery {

    public static TreeMap<String, TreeSet<Person>> getPeopleGroupedByPositionInReverseOrder(List<Person> people){
        return people.stream().collect(Collectors.groupingBy(Person::getPosition,()->new TreeMap<>(Comparator.reverseOrder()),Collectors.toCollection(()->new TreeSet<>(Comparator.comparing(Person::getCode)))));

    }


    public static Map<String, Long> getPeopleCountByPosition(List<Person> people){
        return people.stream().collect(Collectors.groupingBy(Person::getPosition,Collectors.counting())).entrySet().stream()
                .sorted(Comparator.comparing((Map.Entry<String, Long> entry)->entry.getKey().length()).reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
    }
}
