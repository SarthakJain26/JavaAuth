package com.SarthakJain26.JavaAuth.models.pojos;

//pojo: Plain Old Java Object

public class EmployeeRequestPayload {
    Integer age;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
