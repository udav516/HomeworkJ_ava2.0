package org.example.seminar3.cw2;

import org.example.seminar3.cw2.model.Student;
import java.util.ArrayList;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        Student student1 = new Student("Иванова", 2, 237, List.of(6, 4, 5));
        Student student2 = new Student("Машков", 3, 234, List.of(3, 4, 5));
        Student student3 = new Student("Котлова", 2, 234, List.of(3, 4, 5));
        Student student4 = new Student("Михин", 5, 234, List.of(3, 4, 5));

        List<Student> listStudent = new ArrayList<>();
        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);
        listStudent.add(student4);
        for (Student el : listStudent) {
        double sum = 0;
            for (double es : el.getEvaluations()) {
                sum += es;
            }
            if (el.getSurname().endsWith("ова") && sum % 2 == 0) {
                System.out.println(el.getMoney());
            }
        }
    }
}
