package customds;
import java.util.*;
import java.util.stream.Collectors;

public class PersonCollection {
    private List<Person> people = new ArrayList<>();

    public void addPerson(Person person){
        people.add(person);
    }

    public List<Person> getPeople(){
        return people;
    }

    public static void main(String[] args) {
        PersonCollection p = new PersonCollection();
        p.addPerson(new Person("Mannawar", 38));
        p.addPerson(new Person("Ghuncha", 31));
        p.addPerson(new Person("Our Son", 01));

        Map<Integer, List<Person>> peopleByAge =
                p.getPeople().stream().collect(Collectors.groupingBy(Person:: getAge));

        peopleByAge.forEach((age, people) -> {
            System.out.println("People with age: " + age + ":");
            people.forEach(System.out::println);
            System.out.println();
        });
    }
}
