package day17_record;

import java.util.Objects;

public class EmployeeClass extends Object{

    private final String  name;
    private final int employeeId;

    public EmployeeClass(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    @Override
    public String toString() {
        return "EmployeeClass{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeClass that = (EmployeeClass) o;
        return employeeId == that.employeeId && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, employeeId);
    }
}
