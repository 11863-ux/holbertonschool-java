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

    public static  Map<String, Map<Integer, Long>> getPeopleCountByPositionAndAge(List<Person> people){
        return people.stream().collect(Collectors.groupingBy(Person::getPosition,Collectors.groupingBy(Person::getAge,Collectors.counting())))
                .entrySet().stream().sorted(Comparator.comparing((Map.Entry<String, Map<Integer, Long>> entry) -> entry.getKey().length()).reversed())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
    }

    public static Map<String, Double> getAverageSalaryByPosition(List<Person> people){
        return people.stream().collect(Collectors.groupingBy(Person::getPosition,Collectors.averagingDouble(Person::getSalary))).entrySet().stream()
                .sorted(Comparator.comparing((Map.Entry<String, Double> entry)->entry.getKey().length()).reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
    }

    public static Map<String, TreeSet<String>> getHobbiesByPosition(List<Person> people){
        return people.stream().collect(Collectors.groupingBy(Person::getPosition,Collectors.flatMapping(person-> person.getHobbies().stream(),Collectors.toCollection(()->new TreeSet<String>(Comparator.naturalOrder())))))
                .entrySet().stream().sorted(Comparator.comparing((Map.Entry<String, TreeSet<String>> entry) -> entry.getKey().length()).reversed())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
    }
}
