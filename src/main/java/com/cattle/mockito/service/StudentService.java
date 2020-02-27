package com.cattle.mockito.service;

import com.cattle.mockito.dao.StudentDao;
import com.cattle.mockito.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author TODO
 * @Description (这里用一句话描述这个方法的作用)
 * @Classname StudentService
 * @create 2020-02-26 21:23
 * @UpdateUser TODO
 * @UpdateDate 2020-02-26 21:23
 **/
@Service
public class StudentService {
    @Autowired
    StudentDao  studentDao;

    public Student getStudentById(int id){
        return studentDao.getStudentById(1);
    }

}
