package dzoop3;


import java.util.Comparator;

public class SalaryComparator<E> implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        // 1 0 -1
        //return o1.calculateSalary() == o2.calculateSalary() ? 0 : (o1.calculateSalary() > o2.calculateSalary() ? 1 : -1);
        return Double.compare(o2.calculateSalary(), o1.calculateSalary());
    }
}