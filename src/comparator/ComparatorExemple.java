package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExemple {
    private static final List<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) {
        employeeList.add(new Employee(3, "denis", "belchik1"));
        employeeList.add(new Employee(2, "denis2", "belchik9"));
        employeeList.add(new Employee(10, "denis", "belchik4"));
        employeeList.add(new Employee(4, "denis4", "belchik8"));
        System.out.println(employeeList);
        Collections.sort(employeeList);
        employeeList.sort(new ComparatorName());
        System.out.println(employeeList);
    }

}

class ComparatorName implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        int val = o1.getName().compareTo(o2.getName());
        if (val == 0) {
            val = o1.getLastName().compareTo(o2.getLastName());
        }
        return val;
    }
}
