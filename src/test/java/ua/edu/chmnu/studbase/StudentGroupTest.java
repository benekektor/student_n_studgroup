package ua.edu.chmnu.studbase;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentGroupTest {

    @Test
    public void testStudentCreation() {

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

        assertEquals(22210502, student1.getId());
        assertEquals("Ivanov", student1.getLastname());
        assertEquals("Ivan", student1.getFirstname());
        assertEquals("Computer Engineering", student1.getFaculty());
        assertEquals("1234567890", student1.getPhonenum());
        assertEquals(2024, student1.getYear());
        assertEquals(90, student1.getGpa());

        assertEquals(22210503, student2.getId());
        assertEquals("Olexandr", student2.getLastname());
        assertEquals("Nekatarev", student2.getFirstname());
        assertEquals("Computer Engineering", student2.getFaculty());
        assertEquals("0987654321", student2.getPhonenum());
        assertEquals(2024, student2.getYear());
        assertEquals(70, student2.getGpa());

        assertEquals(22210504, student3.getId());
        assertEquals("Pavlo", student3.getLastname());
        assertEquals("Volochai", student3.getFirstname());
        assertEquals("Computer Engineering", student3.getFaculty());
        assertEquals("0984534367", student3.getPhonenum());
        assertEquals(2024, student3.getYear());
        assertEquals(90, student3.getGpa());
    }

    @Test
    public void testGroupCreation() {

        StudGroup group = StudGroup.builder()
                .groupid(22210501)
                .faculty("Computer Engineering")
                .numberOfStudents(2)
                .year(2024)
                .curator("Boris Saltovskiy")
                .build();

        assertEquals(22210501, group.getGroupid());
        assertEquals("Computer Engineering", group.getFaculty());
        assertEquals(2, group.getNumberOfStudents());
        assertEquals(2024, group.getYear());
        assertEquals("Boris Saltovskiy", group.getCurator());
    }
}
