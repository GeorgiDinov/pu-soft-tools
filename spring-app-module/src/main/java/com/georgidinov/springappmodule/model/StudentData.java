package com.georgidinov.springappmodule.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.io.Serializable;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class StudentData implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("student_name")
    private String studentName;
    @JsonProperty("faculty_number")
    private String facultyNumber;

    public StudentData() {
    }

    public StudentData(String studentName, String facultyNumber) {
        this.studentName = studentName;
        this.facultyNumber = facultyNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getFacultyNumber() {
        return facultyNumber;
    }

    public void setFacultyNumber(String facultyNumber) {
        this.facultyNumber = facultyNumber;
    }

    @Override
    public String toString() {
        return "StudentData{" +
                "studentName='" + studentName + '\'' +
                ", facultyNumber='" + facultyNumber + '\'' +
                '}';
    }
}
