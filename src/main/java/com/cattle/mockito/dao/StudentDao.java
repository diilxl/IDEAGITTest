package com.cattle.mockito.dao;

import com.cattle.mockito.domain.Student;
import org.springframework.stereotype.Component;

/**
 * @author TODO
 * @Description (这里用一句话描述这个方法的作用)
 * @Classname StudentDao
 * @create 2020-02-26 21:16
 * @UpdateUser TODO
 * @UpdateDate 2020-02-26 21:16
 **/

@Component
public class StudentDao {
    public Student getStudentById(int id){
        return  new Student(1,10,"tom");
    }
}
