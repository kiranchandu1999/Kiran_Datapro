import java.util.*;
import java.util.function.Predicate;

class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

class StreamExample {
    public static void main(String[] args) {
        int[] nums = {5, 8, 3, 6, 9};
        int[] nums2 = new int[nums.length];

        // convert array into stream and multiply with 2
        nums2 = Arrays.stream(nums).map(n -> n*2).toArray();
        System.out.println(Arrays.toString(nums2));

        List<String> fruits = new ArrayList<>(Arrays.asList("mango", "apple", "banana"));
        fruits = fruits.stream().map(f -> f.toUpperCase()).toList();
        System.out.println(fruits);

        // find employees salary > 30000 and return their names as a list in upper case
        List<Employee> employees = new ArrayList<>(Arrays.asList(
            new Employee("john", 28000),
            new Employee("ashok", 32000),
            new Employee("priya", 25000),
            new Employee("rahul", 45000)
        ));

        List<String> upperNames = employees.stream().filter(e -> {return e.salary > 30000;}).map(e -> e.name.toUpperCase()).sorted((a, b) -> {return b.compareTo(a);}).toList();
        System.out.println(upperNames);
    }
}