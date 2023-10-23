import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class LambdaComplexExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));
        people.add(new Person("Charlie", 22));

        // Lambda function to filter people older than 25
        Predicate<Person> ageFilter = person -> person.age > 25;

        // Lambda function to transform a Person object into a formatted string
        Function<Person, String> personFormatter = person ->
                "Name: " + person.name + ", Age: " + person.age;

        // Applying the filters and transformation
        for (Person person : people) {
            if (ageFilter.test(person)) {
                System.out.println(personFormatter.apply(person));
            }
        }
    }
}
