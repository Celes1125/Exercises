import java.nio.file.attribute.UserPrincipal;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List <Person> persons = List.of (
                new Person ("celeste", 37, 1),
                new Person ("guillermo", 42, 2),
                new Person ("antonio", 3, 3)
        );
        /*for (Person p : persons) {
            System.out.println(p);
        }
        List <Person> mayoresDe18 = persons.stream()
                .filter(person -> person.getAge()>=18)
                .collect(Collectors.toList());
        mayoresDe18.forEach(System.out::println);*/

        List <Person> menoresDe5 = persons.stream()
                .filter(p -> p.getAge()>1)
                .sorted(Comparator.comparing(Person::getName))
                .collect(Collectors.toList());

        menoresDe5.forEach(System.out::println);

    }





}