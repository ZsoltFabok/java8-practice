import org.junit.Before;
import org.junit.Test;
import java.util.List;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;


public class PracticeTest {
    private Practice practice;

    private Person person1 = new Person("Harold", 47);
    private Person person2 = new Person("John", 41);
    private Person person3 = new Person("Root", 31);
    private Person person4 = new Person("Shaw", 30);

    @Before
    public void setup() {
        practice = new Practice();
    }

    @Test
    public void createAListOfIntegersFromArray() {
        List<Integer> numbers = Arrays.asList(1, 7, 5, 2);
        assertEquals(numbers, practice.create_integer_list(1, 7, 5, 2));
    }

    @Test
    public void convertAListOfIntegersToAListOfStrings() {
        List<Integer> numbersInt = Arrays.asList(1, 7, 5, 2);
        List<String> numbersStr = Arrays.asList("1", "7", "5", "2");
        assertEquals(numbersStr, practice.create_string_list(numbersInt));
    }

    @Test
    public void returnTheSumOfIntegers() {
        List<Integer> numbers = Arrays.asList(1, 7, 5, 2);
        assertEquals(15, practice.sum_of_integers(numbers));
    }

    @Test
    public void returnTheAverageOfIntegers() {
        List<Integer> numbers = Arrays.asList(1, 7, 5, 3);
        assertEquals(4, practice.average_of_integers(numbers));
    }

    @Test
    public void returnTheSumOfIntegersInAListOfLists() {
        List<List<Integer>> numbers = Arrays.asList(Arrays.asList(1, 7), Arrays.asList(5, 2));
        assertEquals(15, practice.sum_of_list_of_lists(numbers));
    }

    @Test
    public void returnTheSumOfIntegersFromOneToHundred() {
        assertEquals(5050, practice.sum_of_integers_from_one_to_hundred());
    }

    @Test
    public void filterAllTheNamesStartingWithH() {
        List<String> names = Arrays.asList("Harold", "John", "Root", "Shaw");
        assertEquals(Arrays.asList("Harold"), practice.filter_all_the_names_starting_with_h(names));
    }

    @Test
    public void findTheMaxValue() {
        List<Integer> numbers = Arrays.asList(1, 7, 5, 2);
        assertEquals(7, practice.find_max(numbers));
    }

    @Test
    public void findTheMaxValueInAListOfLists() {
        List<List<Integer>> numbers = Arrays.asList(Arrays.asList(1, 7), Arrays.asList(5, 2));
        assertEquals(7, practice.find_max_in_a_list_of_list(numbers));
    }


    @Test
    public void findTheMaxValueFromListOfStrings() {
        List<String> numbers = Arrays.asList("1", "7", "5", "2");
        assertEquals("7", practice.find_max_from_strings(numbers));
    }

    @Test
    public void sortPersonsByTheirAge() {
        List<Person> persons = Arrays.asList(person1, person2, person3, person4);
        List<Person> expected = Arrays.asList(person4, person3, person2, person1);
        assertEquals(expected, practice.sort_by_age(persons));
    }

    @Test
    public void getTheNames() {
        List<Person> persons = Arrays.asList(person1, person2, person3, person4);
        List<String> names = Arrays.asList("Harold", "John", "Root", "Shaw");
        assertEquals(names, practice.get_the_names(persons));
    }

    @Test
    public void MakeEveryPersonTenYearsYounger() {
        List<Person> persons = Arrays.asList(person1, person2, person3, person4);

        Person person5 = new Person("Harold", 37);
        Person person6 = new Person("John", 31);
        Person person7 = new Person("Root", 21);
        Person person8 = new Person("Shaw", 20);
        List<Person> expected = Arrays.asList(person5, person6, person7, person8);
        assertEquals(expected, practice.make_persons_younger(persons, 10));
    }

    @Test
    public void findThoseWhoAreYoungerThanForty() {
        List<Person> persons = Arrays.asList(person1, person2, person3, person4);
        List<Person> expected = Arrays.asList(person3, person4);

        assertEquals(expected, practice.find_younger_than(persons, 40));
    }
}
