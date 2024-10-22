package ua.edu.chmnu.studbase;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Student {

    private int  id;
    private String lastname;
    private String firstname;
    private String faculty;
    private String phonenum;
    private int year;
    private int gpa;

}