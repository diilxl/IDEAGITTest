package com.cattle.mockito.domain;

/**
 * @author TODO
 * @Description (这里用一句话描述这个方法的作用)
 * @Classname Student
 * @create 2020-02-26 21:17
 * @UpdateUser TODO
 * @UpdateDate 2020-02-26 21:17
 **/
public class Student {
    private int id;
    private int age;
    private String name;

    public Student(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
