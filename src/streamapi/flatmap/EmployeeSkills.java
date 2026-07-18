package streamapi.flatmap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSkills {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        List<String> skills = employees.stream()
                .flatMap(employee -> employee.getSkills().stream())
                .distinct()
                .collect(Collectors.toList());

        System.out.println(skills);
    }

}

class Employee {
    private String name;
    private List<String> skills;

    public List<String> getSkills() {
        return skills;
    }


}

