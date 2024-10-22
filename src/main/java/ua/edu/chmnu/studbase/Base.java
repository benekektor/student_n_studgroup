package ua.edu.chmnu.studbase;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder(toBuilder = true)
public class Base {

    public static void main(String[] args) {

        Student student1 = Student.builder()
                .id(22210502)
                .lastname("Ivanov")
                .firstname("Ivan")
                .faculty("Computer Engineering")
                .phonenum("1234567890")
                .year(2024)
                .gpa(90)
                .build();

        Student student2 = Student.builder()
                .id(22210503)
                .lastname("Olexandr")
                .firstname("Nekatarev")
                .faculty("Computer Engineering")
                .phonenum("0987654321")
                .year(2024)
                .gpa(70)
                .build();

        Student student3 = Student.builder()
                .id(22210504)
                .lastname("Pavlo")
                .firstname("Volochai")
                .faculty("Computer Engineering")
                .phonenum("0984534367")
                .year(2024)
                .gpa(90)
                .build();

        StudGroup group = StudGroup.builder()
                .groupid(22210501)
                .faculty("Computer Engineering")
                .numberOfStudents(2)
                .year(2024)
                .curator("Boris Saltovskiy")
                .build();

        System.out.println("Student 1: " + student1);
        System.out.println("Student 2: " + student2);
        System.out.println("Student 3: " + student3);
        System.out.println("Group: " + group);
    }
}
