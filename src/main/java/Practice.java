import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Practice {
    public int sum_of_integers(List<Integer> numbers) {
        return numbers.stream().reduce(0, (a, b) -> a + b);
    }

    public int sum_of_list_of_lists(List<List<Integer>> numbers) {
        return numbers.stream().map(this::sum_of_integers).reduce(0, (a, b) -> a + b);
    }

    public int sum_of_integers_from_one_to_hundred() {
        return IntStream.range(1, 101).reduce(0, (left, right) -> left + right);
    }


    public List<String> filter_all_the_names_starting_with_h(List<String> names) {
        return names.stream()
                    .filter(name -> name.startsWith("H"))
                    .collect(Collectors.toList());
    }

    public int find_max(List<Integer> numbers) {
        return numbers.stream().max(Integer::compare).get();
    }

    public int find_max_in_a_list_of_list(List<List<Integer>> numbers) {
        return numbers.stream().map(this::find_max).max(Integer::compare).get();
    }

    public String find_max_from_strings(List<String> numbers) {
        return  numbers.stream().max((left, right) -> left.compareTo(right)).get();
        // an uglier one
        // return numbers.stream().map(Integer::parseInt).max(Integer::compare).get().toString();
    }

    public List<Integer> create_integer_list(int... numbers) {
        // boxed()-et megtalálni volt vagy 10 p :(
        return Arrays.stream(numbers).boxed().collect(Collectors.toList());
    }

    public List<String> create_string_list(List<Integer> numbersInt) {
        return numbersInt.stream()
                         .map(String::valueOf)
                         .collect(Collectors.toList());
    }

    public int average_of_integers(List<Integer> numbers) {
        // I gave up this one.
        return sum_of_integers(numbers) / numbers.size();
    }

    public List<Person> sort_by_age(List<Person> persons) {
        return persons.stream().sorted((p1, p2) -> p1.age - p2.age).collect(Collectors.toList());
    }

    public List<String> get_the_names(List<Person> persons) {
        return persons.stream().map(person -> person.name).collect(Collectors.toList());
    }

    public List<Person> make_persons_younger(List<Person> persons, int age) {
        return persons.stream()
                      .map(person -> new Person(person.name, person.age-10))
                      .collect(Collectors.toList());
    }

    public List<Person> find_younger_than(List<Person> persons, int age) {
        return persons.stream()
                      .filter(person -> person.age < 40)
                      .collect(Collectors.toList());
    }
}
