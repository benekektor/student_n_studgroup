package ua.edu.chmnu.studbase;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class StudGroup {

    private int  groupid;
    private String faculty;
    private int numberOfStudents;
    private int year;
    private String curator;

}