package com.georgidinov.springappmodule.controller;

import com.georgidinov.springappmodule.model.StudentData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentDataController {

    Logger log = LoggerFactory.getLogger(StudentDataController.class);

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public StudentData studentData() {
        StudentData dinovData = new StudentData();
        dinovData.setStudentName("Georgi Dinov");
        dinovData.setFacultyNumber("2001717005");
        log.info("Sending student data {}", dinovData);
        return dinovData;
    }

}