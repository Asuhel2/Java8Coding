import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<Employee> employees=new ArrayList<Employee>();
		employees.add(new Employee("Jhon", 30));
		employees.add(new Employee("Alice", 33));
		employees.add(new Employee("Bob", 32));
		List<Employee> sortedEmployees = employees.stream()
                .sorted((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge()))
                .collect(Collectors.toList());

        sortedEmployees.forEach(employee -> System.out.println(employee.getName() + ": " + employee.getAge()));
        
        List<Employee> sortedEmployees1 = employees.stream()
                .sorted(Comparator.comparingInt(Employee::getAge))
                .collect(Collectors.toList());
        
        sortedEmployees1.forEach(employee -> System.out.println(employee.getName() + ": " + employee.getAge()));

	}

}
