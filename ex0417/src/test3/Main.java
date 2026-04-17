package test3;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee("김철수", 3500));
        list.add(new Employee("홍길동", 5000));
        list.add(new Employee("박민수", 8000));
        list.add(new Employee("이영희", 10000));

        Collections.sort(list, (e1,e2)-> e2.getSalary() - e1.getSalary());

        System.out.println("=== 급여 높은 순 정렬 ===");
        for(Employee e : list) {
            e.printInfo();
        }

        Collections.sort(list, (e1,e2)-> e1.getName().compareTo(e2.getName()));

        System.out.println("\n=== 이름 오름차순 정렬 ===");
        for(Employee e : list) {
            e.printInfo();
        }
    }
}