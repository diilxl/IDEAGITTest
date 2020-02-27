package com.cattle.mockito.service;

import com.cattle.mockito.domain.Student;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class StudentServiceTest {

    @Autowired
    StudentService studentService;

    @BeforeEach
    void setUp() {
    }

    @Test
    void getStudentById() {
        Student student = studentService.getStudentById(1);
        Assert.assertNotNull(student);
        int age = student.getAge();
        Assert.assertEquals(student.getAge(),10);
        Assert.assertEquals(student.getName(),"tom");
    }
}